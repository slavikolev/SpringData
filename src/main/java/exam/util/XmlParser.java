package exam.util;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public interface XmlParser {
    <T> T parserXml(Class<T> objectClass,String filepath) throws JAXBException, FileNotFoundException;
}
