package org.java.es3;

public class ElencoInt {
	
	private int[] arrayInt;
	private int counter = 0;

	public ElencoInt(int[] arrayInt) {
		setArrayInt(arrayInt);
	}
	
	public int getElementoSuccessivo() {
		if (hasAncoraElementi())
			return arrayInt[counter++];
		else {
			counter = 0;
			return this.getElementoSuccessivo();
		}
	}
	
	public boolean hasAncoraElementi() {
		return (counter < arrayInt.length) ? true : false;
	}
	
 	public void setArrayInt(int[] arrayInt) {
		this.arrayInt = arrayInt;
	}
	
	public int[] getArrayInt() {
		return arrayInt;
	}
	
	@Override
	public String toString() {
		
		String res = "";
		for (int i = 0; i < arrayInt.length; i++) {
			
			int c = arrayInt[i];
			res += (i < arrayInt.length - 1) ? (c + " - ") : c;
		}
		
		return res;		
	}

}