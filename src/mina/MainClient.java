package mina;

import java.net.InetSocketAddress;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

public class MainClient {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		NioSocketConnector connector = new NioSocketConnector();
		DefaultIoFilterChainBuilder chain = connector.getFilterChain();
		chain.addLast("mychain", new ProtocolCodecFilter(new TextLineCodecFactory()));
		connector.setHandler(new ClientHandler());
		connector.setConnectTimeout(30);
		ConnectFuture connectFuture = connector.connect(new InetSocketAddress("localhost", 9999));
		connectFuture.awaitUninterruptibly();
		connectFuture.getSession().getCloseFuture().awaitUninterruptibly(10);
		connector.dispose();
	}
}
