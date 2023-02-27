package dataStructures;


	import java.util.ArrayList;

	class TridiagonalMatrix {
	    int size;
	    ArrayList<Double> mainDiagonal;
	    ArrayList<Double> upperDiagonal;
	    ArrayList<Double> lowerDiagonal;

	    public TridiagonalMatrix(int size) {
	        this.size = size;
	        mainDiagonal = new ArrayList<>(size);
	        upperDiagonal = new ArrayList<>(size - 1);
	        lowerDiagonal = new ArrayList<>(size - 1);
	    }

	    public void setMainDiagonal(int i, double value) {
	        mainDiagonal.set(i, value);
	    }

	    public void setUpperDiagonal(int i, double value) {
	        upperDiagonal.set(i, value);
	    }

	    public void setLowerDiagonal(int i, double value) {
	        lowerDiagonal.set(i, value);
	    }

	    public double getMainDiagonal(int i) {
	        return mainDiagonal.get(i);
	    }

	    public double getUpperDiagonal(int i) {
	        return upperDiagonal.get(i);
	    }

	    public double getLowerDiagonal(int i) {
	        return lowerDiagonal.get(i);
	    }

	    public int getSize() {
	        return size;
	    }
	}


