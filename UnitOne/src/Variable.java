
public class Variable {
	String name;
	String type;

	public Variable(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBits() {
		int byteSize = 8;
		if (type.equals("byte")) {
			return byteSize * 1;
		} else if (type.equals("short")) {
			return byteSize * 2;
		} else if (type.equals("int")) {
			return byteSize * 4;
		} else if (type.equals("long")) {
			return byteSize * 8;
		} else if (type.equals("float")) {
			return byteSize * 4;
		} else if (type.equals("double")) {
			return byteSize * 8;
		} else if (type.equals("char")) {
			return byteSize * 2;
		} else if (type.equals("boolean")) {
			return 1;
		} else
			return 0;
	}
}
