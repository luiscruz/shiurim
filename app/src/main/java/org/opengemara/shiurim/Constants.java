package org.opengemara.shiurim;

/**
 * Created by OpenGemara on 11/14/2016.
 */

public class Constants
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

    public enum OPINION
    {
        GRACH_NOEH,
        CHAZON_ISH
    }

}
