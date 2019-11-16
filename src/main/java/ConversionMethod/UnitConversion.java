package ConversionMethod;

public class UnitConversion {
    final static int TEMPERATURE_CONVERTER=0;
    final static int CURRENCY_CONVERTER=1;


    private int converterKind=0;

    public UnitConversion(int converterKind)
    {
        this.converterKind = converterKind;
    }


    public String converter(String nowUnitData,String unit,String toUnit)
    {
        String result ="";
        switch (converterKind){
            case 0:

               result= temperatureConverter(nowUnitData,unit,toUnit);
                break;
            case 1:

                result = currencyConverter(nowUnitData,unit,toUnit);
                break;
            default:
                result="The scope of overflow";
                break;
        }

        return result;
    }


    private String temperatureConverter(String nowUnitData,String unit,String toUnit)
    {
        String tmp="";
        double degreeCentigrade;
        double fahrenheit;
        double kelvinDegree;
        switch (unit)
        {
            case "℃":
                {
                degreeCentigrade = Float.parseFloat(nowUnitData);
                fahrenheit = degreeCentigrade*1.8+32;
                kelvinDegree = degreeCentigrade+273.15;
                if (toUnit.equals("F"))
                {
                    tmp=fahrenheit+"℉";
                }
                else if ((toUnit.equals("K"))){
                    tmp = kelvinDegree+"K";
                }

                break;
                }
            case "℉":
                 {
                     fahrenheit = Float.parseFloat(nowUnitData);
                     degreeCentigrade=5/9*(fahrenheit-32);
                     kelvinDegree=degreeCentigrade+273.15;

                     if (toUnit.equals("K"))
                     {
                         tmp = kelvinDegree+"K";
                     }
                     else if(toUnit.equals("℃"))
                     {
                         tmp = degreeCentigrade+"℃";
                     }
                     break;
                 }

            case "K":
                {
                    kelvinDegree = Float.parseFloat(nowUnitData);
                    degreeCentigrade = kelvinDegree-273.15;
                    fahrenheit = degreeCentigrade*1.8+32;
                    if (toUnit.equals("℃"))
                    {
                        tmp = degreeCentigrade+"℃";
                    }
                    else if (toUnit.equals("℉"))
                    {
                        tmp = kelvinDegree+"K";
                    }

                    break;
                }
        }


        return tmp;

    }


    private String currencyConverter(String nowUnitData,String unit,String toUnit)
    {
        String tmp="";

        return tmp;

    }


    public static void main(String[] args) {
        UnitConversion unitConversion = new UnitConversion(UnitConversion.TEMPERATURE_CONVERTER);
        System.out.println(unitConversion.converter("0","℃","K"));
    }

}
