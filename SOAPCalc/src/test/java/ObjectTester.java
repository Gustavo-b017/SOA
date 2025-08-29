import br.com.fiap3espa.service.Sum;
import com.oracle.xmlns.webservices.jaxws_databinding.SoapBindingStyle;
import com.sun.xml.ws.api.databinding.SoapBodyStyle;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public class ObjectTester {
    public static void main(String[] args) {
        Sum soma = new Sum();
        System.out.println(soma.showMessage(9, 27));
        System.out.println(soma.showName());
        System.out.println(soma.calculate(9, 27));
        System.out.println(soma.showSymbol());
    }
}
