package spring;

public class Comments {
	/*
	 * auto Wiring
	 * see into bean, if we need inject something to bean, we chose way (name, type, constructor)
	 * 
	 * if by name we need name we need add setters for bean that we 
	 * want inject and spring will see on setters and provide instances to the setters
	 * !!!for wiring by type or name, object have to have default constructor 
	 * 
	 * if we inject by constructor, we will need constructor with input 
	 * parameters, and spring will inject instances to the constructor same as required parameters
	 * 
	 * ********************
	 * 
	 * wiring by default, type of wiring define in beans.xml
	 * --> default-autowire="byType">  // root element with name beans
	 * this type of wiring will be used everywhere, where type was not defined
	 * 
	 */
}
