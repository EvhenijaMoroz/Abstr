package com.company;

public abstract class Matrix{

    public abstract double set(int i, int j, double value);
    public abstract double get(int i, int j);
    public abstract int getSize();
    public abstract Matrix createMatrix(int n);

public Matrix Multiply(Matrix b){
    Matrix result = createMatrix(getSize());
    for (int i=0; i< getSize(); i++) {
        for (int j = 0; j < getSize(); j++) {
            double sum = 0;
            for (int p = 0; p < getSize(); p++) {
                sum += get(i, p) * b.get(p, j);
            }
            result.set(i, j, sum);
        }
    }
    return result;
}

}

public class testMatrix {
    public static void main(String[] args) {

    }
}
