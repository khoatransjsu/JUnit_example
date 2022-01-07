
import static org.junit.Assert.assertFalse;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

public class example {
	
	@Test
	public void test() {
		
		int num = -1;
		
		TestFactorial test = new TestFactorial(5);
		
		
		
		Assert.assertEquals (test.res(), 120);		
			  
	}
	
	
	public static void main(String[] args) {
		TestFactorial test = new TestFactorial(3);
		System.out.println(test.res());

	}

}
