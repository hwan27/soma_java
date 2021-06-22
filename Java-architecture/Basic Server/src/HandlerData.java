import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.Root;

@Root
public class HandlerData {
	@Attribute(required=false)
	private String header;
	
	@Text
	private String text;
	
	public String getHeader() {
		return header;
	}
	
	public String getHandler() {
		return text;
	}
	
}
