package student;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;


public class XmlIo implements IO{

	@Override
	public String convFromStudToString(Student s){
		 String xmlString = "";
	        try {
	            JAXBContext jc = JAXBContext.newInstance(Student.class);
	            Marshaller m = jc.createMarshaller();	         
	            
	            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

	            StringWriter strWr = new StringWriter();
	            m.marshal(s, strWr);
	            xmlString = strWr.toString();

	        } catch (JAXBException e) {
	            e.printStackTrace();
	        }

	        return xmlString;
	        }
	

	@Override
	public Student convFromStringToStud(String str) throws JAXBException, IOException {
		JAXBContext jc = JAXBContext.newInstance(Student.class);
        Unmarshaller u = jc.createUnmarshaller();
        StringBuffer sb = new StringBuffer(str);
        Student studentNew = (Student) u.unmarshal(new StreamSource( new StringReader(sb.toString())));
        return studentNew;
	}

}
