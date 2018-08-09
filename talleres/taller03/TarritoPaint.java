public class TarritoPaint{
 	 
 	//////////////////////////////////////////////
 	///////////////TARRO DE PAINT/////////////////
 	/////////////////////////////////////////////
 	 
 	 
 	public static int[][] paint(int[][] cuadricula,int col, int x,int y){
 	int b=cuadricula[x][y];
 	cuadricula[x][y] = col;
 	cuadricula = paintAux(cuadricula,col,x,y,b);
 	return cuadricula;
 	 
 	}
 	public static int[][] paintAux(int[][] cuad,int col,int x,int y,int base ){
 	 
 	 
 	if (y >= 1)
 	{
 	 
 	if (cuad[x][y-1]==base)
 	{
 	cuad[x][y-1] = col;
 	cuad = paintAux(cuad,col,x,y-1,base);
 	}
 	}
 	 
 	if (x <= cuad.length-2)
 	{
 	 
 	if(cuad[x+1][y]==base)
 	{
 	cuad[x+1][y]=col;
 	cuad = paintAux(cuad,col,x+1,y,base);
 	}
 	}
 	 
 	if (y <= cuad[0].length-2)
 	{
 	 
 	if ((cuad[x][y+1]==base))
 	{
 	cuad[x][y+1]=col;
 	cuad = paintAux(cuad,col,x,y+1,base);
 	}
 	}
 	 
 	if (x >= 1)
 	{
 	 
 	if((cuad[x-1][y]==base))
 	{
 	cuad[x-1][y]=col;
 	cuad = paintAux(cuad,col,x-1,y,base);
 	}
 	}
 	return cuad;
 	}
 	 
 	 
 	 
 	 
 	}