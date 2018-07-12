public class DocAppoint {

    private Doctor eyed;
    private Doctor nosed;
    private Doctor tongued;
    private Doctor an;
    private Doctor car;
    private Doctor der;
    private Doctor gas;
    private Doctor path;
    private Doctor psy;
    private Doctor rad;
    DocAppoint()
    {
        eyed = new EyeDoc();
        nosed = new NoseDoc();
        tongued = new TongueDoc();
        an=new Anesthesiologists();
        car=new Cardiologist();
        der=new Dermatologists();
        gas=new Gastroenterologists();
        path=new Pathologists();
        psy=new Psychiatrists();
        rad=new Radiologist();
    }

    public void appointEyeD()
    {
        eyed.appoint();
    }

    public void appointNoseD()
    {
        nosed.appoint();
    }

    public void appointTongueD()
    {
        tongued.appoint();
    }

    public void appointAnesthesiologists()
    {
        an.appoint();
    }

    public void appointCardiologist()
    {
        car.appoint();
    }

    public void appointDermatologists()
    {
        der.appoint();
    }

    public void appointGastroenterologists()
    {
        gas.appoint();
    }

    public void appointPathologists()
    {
        path.appoint();
    }

    public void appointPsychiatrists()
    {
        psy.appoint();
    }

    public void appointRadiologists()
    {
        rad.appoint();
    }
}
