/**
 * Created by Tarun 007 on 21-Nov-17.
 */
package com.example.tarun007.myapplication;

class bank {

private int qsn;
private boolean truequestion;

    public bank(int qsn, boolean truequestion) {
        this.qsn = qsn;
        this.truequestion = truequestion;

    }
    public int getQsn()
    {
        return qsn;
    }
    public void setQsn( int qsn)
    {
        this.qsn=qsn;
    }
    public boolean isTruequestion()
    {
        return truequestion;

    }
    public void  setTruequestion( boolean truequestion)
    {
        this.truequestion=truequestion;
    }
}
