import java.text.DecimalFormat;

/**
 *
 */
public class ConversionMontantToLettres {
    private static final String[] lessThantwenty = {
            "",
            "un",
            "deux",
            "trois",
            "quatre",
            "cinq",
            "six",
            "sept",
            "huit",
            "neuf",
            "dix",
            "onze",
            "douze",
            "treize",
            "quatorze",
            "quinze",
            "seize",
            "dix-sept",
            "dix-huit",
            "dix-neuf"
    };

    private static final String[] dizaine = {
            "",
            "",
            "vingt",
            "trente",
            "quarante",
            "cinquante",
            "soixante",
            "soixante",
            "quatre-vingt",
            "quatre-vingt"
    };

    private static String entreZeroEtCent(int number) {
        int lesDizaines = number / 10;
        int lesUnitaires = number % 10;
        String resultat = "";
        String separateur = "";
        if(lesDizaines == 9){
            lesUnitaires += 10;
        }
        if (lesDizaines > 1) {
            separateur = "-";
        }
        switch (lesUnitaires) {
            case 0:
                separateur = "";
                break;
            case 1 :
                if (lesDizaines == 8) {
                    separateur = "-";
                }
                else {
                    separateur = " et ";
                }
                break;
            case 11 :
                if (lesDizaines==7) {
                    separateur = " et ";
                }
                break;
            default:
        }

        switch (lesDizaines) {
            case 0:
                resultat = lessThantwenty[lesUnitaires];
                break;
            case 8 :
                if (lesUnitaires == 0) {
                    resultat = dizaine[lesDizaines];
                }
                else {
                    resultat = dizaine[lesDizaines]
                            + separateur + lessThantwenty[lesUnitaires];
                }
                break;
            default :
                resultat = dizaine[lesDizaines]
                        + separateur + lessThantwenty[lesUnitaires];
        }
        return resultat;
    }
    private static String LessThanOneThousand(int number) {

        int lesCentaines = number / 100;
        int leReste = number % 100;
        String sReste = entreZeroEtCent(leReste);

        String resultat;
        switch (lesCentaines) {
            case 0:
                resultat = sReste;
                break;
            case 1 :
                if (leReste > 0) {
                    resultat = "cent " + sReste;
                }
                else {
                    resultat = "cent";
                }
                break;
            default :
                if (leReste > 0) {
                    resultat = lessThantwenty[lesCentaines] + " cent " + sReste;
                }
                else {
                    resultat = lessThantwenty[lesCentaines] + " cents";
                }
        }
        return resultat;
    }

    public static String convert(long number) {
        // 0 à 999 999 999 999
        if (number == 0) { return "zéro"; }

        String snumber = Long.toString(number);

        // pad des "0"
        String mask = "000000000000";
        DecimalFormat df = new DecimalFormat(mask);
        snumber = df.format(number);

        // XXXnnnnnnnnn
        int lesMilliards = Integer.parseInt(snumber.substring(0,3));
        // nnnXXXnnnnnn
        int lesMillions  = Integer.parseInt(snumber.substring(3,6));
        // nnnnnnXXXnnn
        int lesCentMille = Integer.parseInt(snumber.substring(6,9));
        // nnnnnnnnnXXX
        int lesMille = Integer.parseInt(snumber.substring(9,12));

        String tradMilliards;
        switch (lesMilliards) {
            case 0:
                tradMilliards = "";
                break;
            case 1 :
                tradMilliards = LessThanOneThousand(lesMilliards)
                        + " milliard ";
                break;
            default :
                tradMilliards = LessThanOneThousand(lesMilliards)
                        + " milliards ";
        }
        String resultat =  tradMilliards;

        String tradMillions;
        switch (lesMillions) {
            case 0:
                tradMillions = "";
                break;
            case 1 :
                tradMillions = LessThanOneThousand(lesMillions)
                        + " million ";
                break;
            default :
                tradMillions = LessThanOneThousand(lesMillions)
                        + " millions ";
        }
        resultat =  resultat + tradMillions;

        String tradCentMille;
        switch (lesCentMille) {
            case 0:
                tradCentMille = "";
                break;
            case 1 :
                tradCentMille = "mille ";
                break;
            default :
                tradCentMille = LessThanOneThousand(lesCentMille)
                        + " mille ";
        }
        resultat =  resultat + tradCentMille;

        String tradMille;
        tradMille = LessThanOneThousand(lesMille);
        resultat =  resultat + tradMille;

        return resultat;
    }


    public static void main(String[] args) {
        System.out.println( ConversionMontantToLettres.convert(0));
        System.out.println( ConversionMontantToLettres.convert(9));
        System.out.println( ConversionMontantToLettres.convert(19));
        System.out.println( ConversionMontantToLettres.convert(21));
        System.out.println( ConversionMontantToLettres.convert(28));
        System.out.println( ConversionMontantToLettres.convert(70));
        System.out.println( ConversionMontantToLettres.convert(71));
        System.out.println( ConversionMontantToLettres.convert(72));
        System.out.println( ConversionMontantToLettres.convert(80));
        System.out.println( ConversionMontantToLettres.convert(81));
        System.out.println( ConversionMontantToLettres.convert(89));
        System.out.println( ConversionMontantToLettres.convert(90));
        System.out.println( ConversionMontantToLettres.convert(91));
        System.out.println( ConversionMontantToLettres.convert(97));
        System.out.println( ConversionMontantToLettres.convert(100));
        System.out.println( ConversionMontantToLettres.convert(101));
        System.out.println( ConversionMontantToLettres.convert(110));
        System.out.println( ConversionMontantToLettres.convert(120));
        System.out.println( ConversionMontantToLettres.convert(200));
        System.out.println( ConversionMontantToLettres.convert(201));
        System.out.println( ConversionMontantToLettres.convert(232));
        System.out.println( ConversionMontantToLettres.convert(999));
        System.out.println( ConversionMontantToLettres.convert(1000));
        System.out.println( ConversionMontantToLettres.convert(1001));
        System.out.println( ConversionMontantToLettres.convert(10000));
        System.out.println( ConversionMontantToLettres.convert(10001));
        System.out.println( ConversionMontantToLettres.convert(100000));
        System.out.println( ConversionMontantToLettres.convert(2000000));
        System.out.println( ConversionMontantToLettres.convert(2147483647));

    }
}
