package sample;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "6,755";
		String p = s.replace(",", "");
		System.out.println(p);
		int d = Integer.parseInt(p);
		System.out.println(d);
		String name = "Name Categories Modified On Modified By Status Pending Actions";
		System.out.println(name);
		String[]h=name.split("\\s+");
				for (int i=0;i<h.length;i++)
				{
					System.out.println(h[i]);
				}
		// String[] p=s.split(",");
		// System.out.println(Integer.parseInt(p[0]));
		// System.out.println(p[1]);
		// System.out.println(s);
	}

}
