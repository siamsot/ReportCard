package com.example.siamsot.reportcard;

/**
 * Created by siamsot on 19/08/2017.
 */

public class ReportCard {
    private String mStudentName;
    private double mLangScore;
    private double mMathScore;
    private double mPhysScore;
    private double mHistScore;

    public ReportCard (String studentName, double langScore, double mathScore, double physScore, double histScore){
        mStudentName=studentName;
        mLangScore=langScore;
        mMathScore=mathScore;
        mPhysScore=physScore;
        mHistScore=histScore;
    }

    public String getmStudentName() {
        return mStudentName;
    }

    public void setmStudentName(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    public double getmLangScore() {
        return mLangScore;
    }

    public void setmLangScore(double mLangScore) {
        this.mLangScore = mLangScore;
    }

    public double getmMathScore() {
        return mMathScore;
    }

    public void setmMathScore(double mMathScore) {
        this.mMathScore = mMathScore;
    }

    public double getmPhysScore() {
        return mPhysScore;
    }

    public void setmPhysScore(double mPhysScore) {
        this.mPhysScore = mPhysScore;
    }

    public double getmHistScore() {
        return mHistScore;
    }

    public void setmHistScore(double mHistScore) {
        this.mHistScore = mHistScore;
    }
}
