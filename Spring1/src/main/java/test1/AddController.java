package test1;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.GiamDoc;
import entity.HocSinh;
import entity.NhanVien;

@Controller
public class AddController {

	@RequestMapping("/")	
	@ResponseBody
	public String display() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		NhanVien nv = (NhanVien) context.getBean("nhanvien");
		HocSinh hs = (HocSinh) context.getBean("hocsinh");
		nv.getInfo();
		hs.getInfo();
		//há»“i xÆ°a thay vi new nhiá»�u nhÃ¢n viÃªn ta cÃ³ thá»ƒ táº¡o ra 1 cÃ¡i sigleton static Ä‘á»ƒ gá»�i
		
		//video 6
//		NhanVien nv2 = NhanVien.createNhanVien();
//		nv2.getInfo();
		
//		((ClassPathXmlApplicationContext)context).close(); //Ã©p kiá»ƒu vá»� má»›i Ä‘Ã³ng Ä‘Æ°á»£c náº¿u k context sáº½ bá»‹ underline
		
		//video 7
	System.out.println("=========================");
	NhanVien nv2 = (NhanVien) context.getBean("nhanvien");
	nv2.getInfo();
	System.out.println("Giam doc: " + nv2.getGiamDoc().getTenNhanVien() + " - " + nv2.getGiamDoc().getChucVu());
		
	//video 8
	System.out.println("============ list str=============");

		for(String s : nv2.getList()) {
			System.out.println(s);
		}
		
		System.out.println("============list Giam doc=============");
		for(GiamDoc s2 : nv2.getListGiamDoc()) {
			System.out.println("Giam doc: " + s2.getTenNhanVien() + " - " + s2.getChucVu());
		}
		
		//video 9
		System.out.println("============Giam doc MAP=============");
		for(Entry<String, Object> s2 : nv2.getMap().entrySet()) {
			System.out.println("- " + s2.getKey() + " - " + s2.getValue());
		}
		System.out.println("=========================");
		GiamDoc doc = (GiamDoc) nv2.getMap().get("key2");
		System.out.println("MAP: Giam doc: " + doc.getTenNhanVien() + " - " + doc.getChucVu());
	
		System.out.println("=========== video 10 ==============");
		System.out.println("jdbc: " + nv2.getProperties().getProperty("jdbc"));
	
	
	return "trangchu";
	}
	//neu thÃªm index.jsp trong web-inf thÃ¬ thay láº¡i lÃ  /trang chu
	
	@RequestMapping("/demo")
	@ResponseBody
	public String demo() {
		return "demo";
	}
	
	@RequestMapping("/trangchu")
	public String demo1() {
		return "trangchu";
	}
}
