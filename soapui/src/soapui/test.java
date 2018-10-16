package soapui;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.junit.Assert;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.iface.Submit.Status;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

public class test {

	public static void main(String[] args) throws IOException, SoapUIException, XmlException {
		// TODO Auto-generated method stub
		WsdlProject project =new WsdlProject("/Users/rahulmittapalli/XML projects/Products-soapui-project.xml");
		WsdlTestSuite testsuite=project.getTestSuiteByName("REST");
		for(int i=0;i<testsuite.getTestCaseCount();i++)
		{
			WsdlTestCase testcase=testsuite.getTestCaseAt(i);
			TestRunner runner=testcase.run(new PropertiesMap(), false);
			Assert.assertEquals(Status.FINISHED,runner.getStatus());
		}
	}
}
