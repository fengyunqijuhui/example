package mina;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.SocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class MainServer {

	public static void main(String[] args) throws Exception {
		SocketAcceptor acceptor = new NioSocketAcceptor();
		DefaultIoFilterChainBuilder chain = acceptor.getFilterChain();
		chain.addLast("mychain", new ProtocolCodecFilter(new TextLineCodecFactory()));
		acceptor.setHandler(new ServerHandler());
		int port = 9999;
		acceptor.bind(new InetSocketAddress(port));
		System.out.println("port" + port);
		
	}
}
