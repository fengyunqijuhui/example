package mina;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class ServerHandler extends IoHandlerAdapter{

	private int count = 0;
	
	@Override
	public void sessionOpened(IoSession session) throws Exception {
		System.out.println("remoteaddress" + session.getRemoteAddress());
	}
	@Override
	public void sessionClosed(IoSession session) throws Exception {
		//System.out.println("session closed");
	}
	@Override
	public void messageReceived(IoSession session, Object message)
			throws Exception {
		String s = message.toString();
		System.out.println("message" + s);
		session.write(s + count++);
	}
}
