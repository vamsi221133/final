package guru_selenium;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocketendpoint")
public class WebSurver {

	@OnOpen// is used on a @ServerEndpoint method, but only once per endpoint, once new connection is established.
	public void onOpen(){
		System.out.println("open connection");
		
	}
	@OnClose// ' ' ' 'once the connection is being closed.
	public void onClose() {
		System.out.println("close connection");
	}
	@OnMessage
	public String onMessage(String message)
	{
		System.out.println("message from clint"+message);
		String echomsg = "echo from the surver :"+message;
		return echomsg;
	}
	@OnError
	public void onError(Throwable e) {
		e.printStackTrace();
	}
	
}
