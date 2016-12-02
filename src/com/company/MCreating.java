package com.company;

/**
 * Created by 777 on 01.12.2016.
 */
public class MCreating extends Matrix {
    private Matrix matrix;
    private double n;

    public MCreating(double n){
        createMatrix((int) n);
    }

    public void DetMatrix(){
        System.out.println();
        for (int i = 0; i < matrix.getSize(); i++){
            double res = 0;
            for (int j = 0; j < matrix.getSize(); j++){
                res =
            }
        }
    }
    @Override
    public double set(int i, int j, double value) {
        return 0;
    }

    @Override
    public double get(int i, int j) {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Matrix createMatrix(int n) {
        matrix = new Matrix() {
            @Override
            public double set(int i, int j, double value) {
                return matrix [i][j] = value;
            }

            @Override
            public double get(int i, int j) {
                return matrix [i][j];
            }

            @Override
            public int getSize() {
                return matrix.getSize();
            }

            @Override
            public Matrix createMatrix(int n) {
                return null;
            }
        };
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix [i][j] = (int) (Math.random()*10);
            }
        }
        return matrix;
    }
}
