
package poo.introduccion;
import upm.jbb.IO;

public class DemoIO {
	
	public DemoIO(int i,double d){
		IO.out.println(i+d);
		}

		public DemoIO(){
		}

		public void imprimir() {
		String[] s = {"uno","dos","tres"};
		IO.out.println("Imprimecualquiercosaquelepases...");
		IO.out.print(3);
		IO.out.println();
		IO.out.println(s);
		}
		
		
		public void leerBasico(){
		IO.out.println("Leetiposbásicos");
		IO.out.println(IO.in.readString("Dameunacadena"));
		IO.out.println(IO.in.readInt());
		IO.out.println(IO.in.readDouble("valor"));
		}

		public void leerAvanzado(){
		IO.out.println("Leecualquier tipo");
		IO.out.println(IO.in.read("byte","Unbyte..."));
		IO.out.println(IO.in.read("boolean","Unboolean..."));
		IO.out.println(IO.in.read("Short","UnShort..."));
		IO.out.println(IO.in.read("Integer[]","UnarraydeInteger..."));
		IO.out.println(IO.in.read("java.util.List<Integer>","UnaListdeInteger..."));
		IO.out.println(IO.in.read("poo.introduccion.DemoIO","UnUsr..."));
		IO.out.println(IO.in.read("java.awt.Color","Uncolor"));
		IO.out.println(IO.in.readOpenFile("Mificheroparaabrir"));
		IO.out.println(IO.in.readSaveFile("Mificheroparasalvar"));
		}

		public void listaDesplegable(){
		IO.out.println("Semuestraunalistadeobjetos,seapoyaentoString()");
		Object[] s = {"uno","dos","tres"};
		IO.out.println(IO.in.select(10, "Edad"));
		IO.out.println(IO.in.select(18, 65, "Edad"));
		IO.out.println(IO.in.select(s, "Elige..."));
		}

		public void formulario(){
		IO.out.println("Leeformularios");
		String[]clases={"Byte","String","String[]"};
		String[]msgs={"Edad","Nombre","Array"};
		IO.out.println(IO.in.readForm(clases,msgs));
		}

		public static void main(String[]args){
		IO.in.addController(new DemoIO());
		IO.out.setStatusBar("Demo");
		//System.out.println("consola...");
		//IO.out.clear();
		}

}


