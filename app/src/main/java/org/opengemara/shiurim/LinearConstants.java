package org.opengemara.shiurim;

/**
 * Created by OpenGemara on 11/14/2016.
 */
enum OPINION
{
    GRACH_NOEH,
    CHAZON_ISH
}

public class LinearConstants
{
    public static SECULAR_TYPES getSecularType(String title) throws Exception
    {
        switch (title)
        {
            case "mm":
                return SECULAR_TYPES.MM;
            case "cm":
                return SECULAR_TYPES.CM;
            case "m":
                return SECULAR_TYPES.M;
            case "km":
                return SECULAR_TYPES.KM;
            case "in":
                return SECULAR_TYPES.IN;
            case "ft":
                return SECULAR_TYPES.FT;
            case "mi":
                return SECULAR_TYPES.MI;
        }
        throw new Exception("Type Error");
    }

    public static HEBREW_TYPES getHebrewType(String title) throws Exception
    {
        switch (title)
        {
            case "Se\'Orah":
                return HEBREW_TYPES.SEORAH;
            case "Agodal":
                return HEBREW_TYPES.AGODEL;
            case "Aniva":
                return HEBREW_TYPES.ANIVA;
            case "Tefach":
                return HEBREW_TYPES.TEFACH;
            case "Ammah":
                return HEBREW_TYPES.AMMAH;
            case "Mil":
                return HEBREW_TYPES.MIL;
            case "Parsah":
                return HEBREW_TYPES.PARSAH;

        }
        throw new Exception("Type Error");
    }

    public static OPINION getOpinion(String title) throws Exception
    {
        switch (title)
        {
            case "R\' Avrohom Chaim Naeh":
                return OPINION.GRACH_NOEH;
            case "Chazon Ish":
                return OPINION.CHAZON_ISH;
        }
        throw new Exception("Type error");
    }

    public static double fromMM(SECULAR_TYPES type, double val) throws Exception
    {
        switch (type)
        {
            case MM:
                return val / 1.;
            case CM:
                return val / 10.;
            case M:
                return val / 1000.;
            case KM:
                return val / 1000000.;
            case IN:
                return val / 25.4;
            case FT:
                return val / 304.8;
            case MI:
                return val / 1609000.;
            default:
                throw new Exception("Type Error");
        }
    }


    public static double seorahToMM(OPINION op, double val) throws Exception
    {
        switch (op)
        {
            case GRACH_NOEH:
                return val * 1.;
            case CHAZON_ISH:
                return val * 1.2;
            default:
                throw new Exception("Type Error");
        }
    }

    public static double toSeorah(HEBREW_TYPES type, double val) throws Exception
    {
        switch (type)
        {
            case SEORAH:
                return val * 10;
            case AGODEL:
                return val * 20;
            case ANIVA:
                return val * 40;
            case TEFACH:
                return val * 80;
            case AMMAH:
                return val * 480;
            case MIL:
                return val * 960000;
            case PARSAH:
                return val * 3840000;
            default:
                throw new Exception("Type Error");
        }
    }

    public enum SECULAR_TYPES
    {
        MM,
        CM,
        M,
        KM,
        IN,
        FT,
        MI
    }

    public enum HEBREW_TYPES
    {
        SEORAH,
        AGODEL,
        ANIVA,
        TEFACH,
        AMMAH,
        MIL,
        PARSAH
    }

}

class AreaConstants
{
    public static double fromSquareM(SECULAR_TYPES type, double val) throws Exception
    {
        switch (type)
        {
            case SQUARE_M:
                return val / 1.;
            case SQUARE_KM:
                return val / 1000000.;
            case SQUARE_FT:
                return val / 10.7639;
            case SQUARE_MI:
                return val / 3.86102e-7;
            case ACRE:
                return val / 0.000247105;
            default:
                throw new Exception("Type Error");
        }
    }

    public static double toSquareAmmah(HEBREW_TYPES type, double val) throws Exception
    {
        switch (type)
        {
            case BEIS_KAV:
                return val * 416;
            case BEIS_ROVA:
                return val * 104;
            case BEIS_SAAH:
                return val * 2500;
            case BEIS_KUR:
                return val * 75000;
        }

        throw new Exception("Type Error");

    }

    public static double squareAmmahToSquareMeter(OPINION op, double val) throws Exception
    {
        double meters = LinearConstants.fromMM(LinearConstants.SECULAR_TYPES.M, LinearConstants.seorahToMM(op, LinearConstants.toSeorah(LinearConstants.HEBREW_TYPES.AMMAH, val)));
        return meters * meters;
    }

    public static SECULAR_TYPES getSquareSecularType(String title) throws Exception
    {
        switch (title)
        {
            case "Acre":
                return SECULAR_TYPES.ACRE;
            case "sq. ft.":
                return SECULAR_TYPES.SQUARE_FT;
            case "sq. km":
                return SECULAR_TYPES.SQUARE_KM;
            case "sq. m":
                return SECULAR_TYPES.SQUARE_M;
            case "sq. mi.":
                return SECULAR_TYPES.SQUARE_MI;
        }
        throw new Exception("Type Error");
    }

    public static HEBREW_TYPES getSquareHebrewType(String title) throws Exception
    {
        switch (title)
        {
            case "Beis Kav":
                return HEBREW_TYPES.BEIS_KAV;
            case "Beis Kur":
                return HEBREW_TYPES.BEIS_KUR;
            case "Beis Rova":
                return HEBREW_TYPES.BEIS_ROVA;
            case "Beis Saah":
                return HEBREW_TYPES.BEIS_SAAH;
        }
        throw new Exception("Type Error");
    }

    public enum HEBREW_TYPES
    {
        SQUARE_SEORAH,
        BEIS_KUR,
        BEIS_SAAH,
        BEIS_KAV,
        BEIS_ROVA
    }

    public enum SECULAR_TYPES
    {
        SQUARE_M,
        SQUARE_KM,
        SQUARE_FT,
        SQUARE_MI,
        ACRE
    }

}