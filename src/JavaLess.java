import java.io.*;
import java.util.Calendar;
/*
 * Name: JavaLess
 * Author: Matej Hakos
 * Version: 1.27
 */
import java.util.Random;

public class JavaLess {
	
	//PI and stuff
	public static double PI = Math.PI;
	public static double HALF_PI = Math.PI/2;
	public static double QUARTER_PI = Math.PI/4;
	public static double TWO_PI = Math.PI*2;
	
	private static BufferedReader in;
	
	//random generator - najs
	
	private static Random rnd = new Random();
	
	public static int random(int cislo){
		return rnd.nextInt(cislo)+1;
	}
	public static int random(int dolna,int horna){
		horna++;
		return rnd.nextInt(horna-dolna)+(dolna);
	}
	public static double random(){
		return rnd.nextFloat();
	}
	
	//Sysout
	//print
	public static void print(Object a){
		System.out.print(a);
	}
	//Print line
	public static void println(Object a){
		System.out.print(a);
	}
	private static void println() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	
	public static void println(int[] a) {
		// TODO Auto-generated method stub
        for (int p:a) {
            System.out.println(p);
        }
	}
	public static void println(double[] a) {
		// TODO Auto-generated method stub
        for (double p:a) {
            System.out.println(p);
        }
	}
	public static void println(float[] a) {
		// TODO Auto-generated method stub
        for (float p:a) {
            System.out.println(p);
        }
	}
	public static void println(long[] a) {
		// TODO Auto-generated method stub
        for (long p:a) {
            System.out.println(p);
        }
	}
	public static void println(String[] a) {
		// TODO Auto-generated method stub
        for (String p:a) {
            System.out.println(p);
        }
	}
	public static void println(char[] a) {
		// TODO Auto-generated method stub
        for (char p:a) {
            System.out.println(p);
        }
	}
	public static void println(Object[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	//sorts
	//bubble
	public static void sort(int pole[]){
	        int n = pole.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (pole[j] > pole[j+1])
	                {
	                    int temp = pole[j];
	                    pole[j] = pole[j+1];
	                    pole[j+1] = temp;
	                }
	}
	public static void sort(int pole[],boolean volba){ // true = smallest up
		if(volba){
			int n = pole.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (pole[j] > pole[j+1])
	                {
	                    int temp = pole[j];
	                    pole[j] = pole[j+1];
	                    pole[j+1] = temp;
	                }
		}else{
			int n = pole.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (pole[j] < pole[j+1])
	                {
	                    int temp = pole[j];
	                    pole[j] = pole[j+1];
	                    pole[j+1] = temp;
	                }
		}
	}
	//selection sort
	public static void selectionSort(int array[]){
		for (int i = 0; i < array.length - 1; i++) {
			int maxIndex = i;
		for (int j = i + 1; j < array.length; j++) {
			if (array[j] < array[maxIndex]) maxIndex = j;
		}
		int tmp = array[i];
		array[i] = array[maxIndex];
		array[maxIndex] = tmp;
		}
	}
	public static void selectionSort(int array[],boolean volba){
		if(volba){
			for (int i = 0; i < array.length - 1; i++) {
				int maxIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[maxIndex]) maxIndex = j;
			}
			int tmp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = tmp;
			}
		}else{
			for (int i = 0; i < array.length - 1; i++) {
				int maxIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[maxIndex]) maxIndex = j;
			}
			int tmp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = tmp;
			}
		}
	}
	//insertion sort
	public static void insertionSort(int array[]){
		for (int i = 0; i < array.length - 1; i++) {
			int j = i + 1;
			int tmp = array[j];
			while (j >= 0 && tmp < array[j-1]) {
				array[j] = array[j-1];
				j--;				
			}				
				array[j] = tmp;
		}
	}
	public static void insertionSort(int array[],boolean volba){
		if(volba){
			for (int i = 0; i < array.length - 1; i++) {
				int j = i + 1;
				int tmp = array[j];
				while (j >= 0 && tmp < array[j-1]) {
					array[j] = array[j-1];
					j--;				
				}				
					array[j] = tmp;
				}
		}else{
			for (int i = 0; i < array.length - 1; i++) {
				int j = i + 1;
				int tmp = array[j];
				while (j > 0 && tmp > array[j-1]) {
					array[j] = array[j-1];
					j--;				
				}				
					array[j] = tmp;
				}
		}
	}
	
	//math - absoulute number
	
	public static int abs(int number){
		return Math.abs(number);
	}
	public static double abs(double number){
		return Math.abs(number);
	}
	public static float abs(float number){
		return Math.abs(number);
	}
	public static long abs(long number){
		return Math.abs(number);
	}
	
	//round
	
	public static double round(double number,boolean volba){
		double n = Math.round(number);
		if (volba) {
				return (n+=1);
		}else{
			return n;
		}
	}
	//round to closest higher or equal
	public static double ceil(double cislo){
		double n = Math.round(cislo);
		if(n<cislo){
			return n+=1;
		}
		return n;
	}
	public static double ceil(float cislo){
		double n = Math.round(cislo);
		if(n<cislo){
			return n+=1;
		}
		return n;
	}
	//floor - convert float/double to int
	public static int floor(float number){
		return (int)number;
	}
	public static int floor(double number){
		return (int)number;
	}
	//logarithm natural + base 10
	public static double log(float number){
		return Math.log(number);
	}
	public static double log(double number){
		return Math.log(number);
	}
	public static double log10(float number){
		return Math.log10(number);
	}
	public static double log10(double number){
		return Math.log10(number);
	}
	
	//max min - only for 2 or 3 floats and unliminited array
	public static float max(float a,float b,float c){
		if(a>b && a>c){
			return a;
		}else if(b>a && b>c){
			return b;
		}else{
			return c;
		}
	}
	public static float max(float a,float b){
		if(a>b){
			return a;
		}
		return b;
	}
	public static int max(int[] array){
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	public static double max(double[] array){
		double max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	public static float max(float[] array){
		float max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	public static long max(long[] array){
		long max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	//minimal value
	public static float min(float a,float b,float c){
		if(a<b && a<c){
			return a;
		}else if(b<a && b<c){
			return b;
		}else{
			return c;
		}
	}
	public static float min(float a,float b){
		if(a<b){
			return a;
		}
		return b;
	}
	public static int min(int[] array){
		int min = 1000;
		for (int i = 0; i < array.length; i++) {
			if (min>array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	public static double min(double[] array){
		double min = 0;
		for (int i = 0; i < array.length; i++) {
			if (min>array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	public static float min(float[] array){
		float min = 0;
		for (int i = 0; i < array.length; i++) {
			if (min>array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	public static long min(long[] array){
		long min = 0;
		for (int i = 0; i < array.length; i++) {
			if (min>array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	//power - requires two ints
	public static double pow(int number,int power){
		long n = 1;
		if(power > 0){
			for (int i = 0; i < power; i++) {
				n*=number;
			}
			return (double) n;
		}else{
			power = abs(power);
			for (int i = 0; i < power; i++) {
				n*=number;
			}
			println();
			return (double)1/n;
		}
	}
	
	//square
	public static double sq(double number) {
		return number*number;
	}
	public static int sq(int number) {
		return number*number;
	}
	public static float sq(float number) {
		return number*number;
	}
	public static long sq(long number) {
		return number*number;
	}
	//square root
	public static double sqrt(double number) {
		return Math.sqrt(number);
	}
	public static double sqrt(int number) {
		return Math.sqrt(number);
	}
	public static double sqrt(float number) {
		return Math.sqrt(number);
	}
	public static double sqrt(long number) {
		return Math.sqrt(number);
	}
	
	//random from array
	
	public static Object random(Object []a){
		return a[rnd.nextInt(a.length)];
	}	
	//open file
	
	public static void fopen(String dir) throws IOException{
		in = new BufferedReader(new FileReader(dir));
	}
	public void fclose() throws IOException {
		// TODO Auto-generated method stub
		in.close();
	}
	
	//Date and time
	private static Calendar c = Calendar.getInstance();
	
	public static int day() {
		return c.get(Calendar.HOUR_OF_DAY);
	}
	public static int minute() {
		return c.get(Calendar.MINUTE);
	}
	public static int second() {
		return c.get(Calendar.SECOND);
	}
	public static int mill() {
		return c.get(Calendar.MILLISECOND);	
	}
}
