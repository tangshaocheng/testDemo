package nettyTest;

import java.util.Date;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class TimeClientHandler extends ChannelHandlerAdapter {
	private ByteBuf buf;

	@Override
	public void handlerAdded(ChannelHandlerContext ctx) {
		buf = ctx.alloc().buffer(4); // (1)
	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) {
		buf.release(); // (1)
		buf = null;
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		ByteBuf m = (ByteBuf) msg;
		buf.writeBytes(m); // (2)
		m.release();
		if (buf.readableBytes() >= 4) { // (3)
			long currentTimeMillis = (buf.readInt() - 2208988800L) * 1000L;
			System.out.println(new Date(currentTimeMillis));
			ctx.close();
		}
	}

	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		cause.printStackTrace();
		ctx.close();
	}

}
