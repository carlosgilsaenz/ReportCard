package com.example.csaenz.reportcard;

/**
 * Created by csaenz on 3/28/2017.
 */

public class ReportCard {

    private static final int MAXIMUM_GRADE = 100;

    private static final int MINIMUM_GRADE = 0;

    private static final int MINIMUM_YEAR = 1990;

    int mYear;

    int mGradeMath;

    int mGradeEnglish;

    int mGradeHistory;

    int mGradeScience;

    int mGradePE;

    /**
     *  Main Constructor requires Year
     */

    public ReportCard(int year){
        mYear = year;
        mGradeMath = MINIMUM_GRADE;
        mGradeEnglish = MINIMUM_GRADE;
        mGradeHistory = MINIMUM_GRADE;
        mGradeScience = MINIMUM_GRADE;
        mGradePE = MINIMUM_GRADE;
    }

    /**
     * All getters for each variable
     */
    public int getYear() {
        return mYear;
    }

    public int getGradeMath() {
        return mGradeMath;
    }

    public int getGradeEnglish() {
        return mGradeEnglish;
    }

    public int getGradeHistory() {
        return mGradeHistory;
    }

    public int getGradeScience() {
        return mGradeScience;
    }

    public int getGradePE() {
        return mGradePE;
    }

    /**
     * All setters for each variable
     */

    public void setYear(int year) {
        if(year > MINIMUM_YEAR){
            mYear = year;
        }
    }

    public void setGradeMath(int grade) {
        if(grade >= MINIMUM_GRADE && grade <= MINIMUM_GRADE){
            mGradeMath = grade;
        }
    }

    public void setGradeEnglish(int grade) {
        if(grade >= MINIMUM_GRADE && grade <= MINIMUM_GRADE){
            mGradeEnglish = grade;
        }
    }

    public void setGradeHistory(int grade) {
        if(grade >= MINIMUM_GRADE && grade <= MINIMUM_GRADE){
            mGradeHistory = grade;
        }
    }

    public void setGradeScience(int grade) {
        if(grade >= MINIMUM_GRADE && grade <= MINIMUM_GRADE){
            mGradeScience = grade;
        }
    }

    public void setGradePE(int grade) {
        if(grade >= MINIMUM_GRADE && grade <= MINIMUM_GRADE){
            mGradePE = grade;
        }
    }
    /**
     * toString() Override method
     */

    @Override
    public String toString() {
        return "ReportCard{" +
                "Year = " + mYear +
                ", Math Grade = " + mGradeMath +
                ", English Grade = " + mGradeEnglish +
                ", History Grade = " + mGradeHistory +
                ", Science Grade = " + mGradeScience +
                ", P.E. Grade = " + mGradePE +
                '}';
    }
}
