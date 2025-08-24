package Tests_4;

import org.testng.IExecutionVisualiser;

public class ExecutionVisualizer implements IExecutionVisualiser {
 
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return IExecutionVisualiser.super.isEnabled();
	}
 
	@Override
	public void consumeDotDefinition(String dotDefinition) {
		// TODO Auto-generated method stub
		System.out.println("Consume dot definition");
		System.out.println(dotDefinition);
		
	}
	public void consumeSvg(String svg) {
		System.out.println("svg data");
		System.out.println(svg.substring(0,10));
	}
 
}
