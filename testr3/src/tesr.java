import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.common.types.MouseButton;
import com.borland.silktest.jtf.common.types.Point;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.Desktop;

public class tesr {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'http://nimbusserver:8000/#/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void trte() {
		desktop.<DomElement>find("nimbusserver.BrowserWindow.speakersImg").click(MouseButton.LEFT, new Point(341, 159));
		desktop.<DomElement>find("nimbusserver.BrowserWindow.20").click(MouseButton.LEFT, new Point(88, 74));
		desktop.<DomButton>find("nimbusserver.BrowserWindow.save_to_cart").click(MouseButton.LEFT, new Point(123, 35));
		desktop.<DomLink>find("nimbusserver.BrowserWindow.shoppingCartLink").click(MouseButton.LEFT, new Point(20, 8));
		desktop.<DomLink>find("nimbusserver.BrowserWindow.REMOVE").click(MouseButton.LEFT, new Point(9, 14));
		desktop.<DomLink>find("nimbusserver.BrowserWindow.CONTINUE SHOPPING").click(MouseButton.LEFT,
				new Point(114, 22));
	}

}