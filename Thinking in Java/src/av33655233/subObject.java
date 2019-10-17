/*
 * Object equals()
 * */
package av33655233;

public class subObject {
	private int num;
	public boolean equals(Object obj) {
		if(!(obj instanceof subObject))
			return false;
		subObject subobj = (subObject)obj;
		return this.num == subobj.num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subObject s1 = new subObject();
		subObject s2 = new subObject();
		s1.num = 1;
		s2.num = 1;
		System.out.println(s1.equals(s2));
	}

}
