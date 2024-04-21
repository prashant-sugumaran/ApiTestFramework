package io.backend.api.entities.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyResponse {

    private String result;
    private String provider;
    private String documentation;
    @JsonProperty("terms_of_use")
    private String termsOfUse;
    @JsonProperty("time_last_update_unix")
    private long timeLastUpdateUnix;
    @JsonProperty("time_last_update_utc")
    private String timeLastUpdateUtc;
    @JsonProperty("time_next_update_unix")
    private long timeNextUpdateUnix;
    @JsonProperty("time_next_update_utc")
    private String timeNextUpdateUtc;
    @JsonProperty("time_eol_unix")
    private long timeEolUnix;
    @JsonProperty("base_code")
    private String baseCode;
    private Rates rates;

    @Getter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Rates {
        @JsonProperty("USD")
        public int uSD;
        @JsonProperty("AED")
        public double aED;
        @JsonProperty("AFN")
        public double aFN;
        @JsonProperty("ALL")
        public double aLL;
        @JsonProperty("AMD")
        public double aMD;
        @JsonProperty("ANG")
        public double aNG;
        @JsonProperty("AOA")
        public double aOA;
        @JsonProperty("ARS")
        public double aRS;
        @JsonProperty("AUD")
        public double aUD;
        @JsonProperty("AWG")
        public double aWG;
        @JsonProperty("AZN")
        public double aZN;
        @JsonProperty("BAM")
        public double bAM;
        @JsonProperty("BBD")
        public int bBD;
        @JsonProperty("BDT")
        public double bDT;
        @JsonProperty("BGN")
        public double bGN;
        @JsonProperty("BHD")
        public double bHD;
        @JsonProperty("BIF")
        public double bIF;
        @JsonProperty("BMD")
        public int bMD;
        @JsonProperty("BND")
        public double bND;
        @JsonProperty("BOB")
        public double bOB;
        @JsonProperty("BRL")
        public double bRL;
        @JsonProperty("BSD")
        public int bSD;
        @JsonProperty("BTN")
        public double bTN;
        @JsonProperty("BWP")
        public double bWP;
        @JsonProperty("BYN")
        public double bYN;
        @JsonProperty("BZD")
        public int bZD;
        @JsonProperty("CAD")
        public double cAD;
        @JsonProperty("CDF")
        public double cDF;
        @JsonProperty("CHF")
        public double cHF;
        @JsonProperty("CLP")
        public double cLP;
        @JsonProperty("CNY")
        public double cNY;
        @JsonProperty("COP")
        public double cOP;
        @JsonProperty("CRC")
        public double cRC;
        @JsonProperty("CUP")
        public int cUP;
        @JsonProperty("CVE")
        public double cVE;
        @JsonProperty("CZK")
        public double cZK;
        @JsonProperty("DJF")
        public double dJF;
        @JsonProperty("DKK")
        public double dKK;
        @JsonProperty("DOP")
        public double dOP;
        @JsonProperty("DZD")
        public double dZD;
        @JsonProperty("EGP")
        public double eGP;
        @JsonProperty("ERN")
        public int eRN;
        @JsonProperty("ETB")
        public double eTB;
        @JsonProperty("EUR")
        public double eUR;
        @JsonProperty("FJD")
        public double fJD;
        @JsonProperty("FKP")
        public double fKP;
        @JsonProperty("FOK")
        public double fOK;
        @JsonProperty("GBP")
        public double gBP;
        @JsonProperty("GEL")
        public double gEL;
        @JsonProperty("GGP")
        public double gGP;
        @JsonProperty("GHS")
        public double gHS;
        @JsonProperty("GIP")
        public double gIP;
        @JsonProperty("GMD")
        public double gMD;
        @JsonProperty("GNF")
        public double gNF;
        @JsonProperty("GTQ")
        public double gTQ;
        @JsonProperty("GYD")
        public double gYD;
        @JsonProperty("HKD")
        public double hKD;
        @JsonProperty("HNL")
        public double hNL;
        @JsonProperty("HRK")
        public double hRK;
        @JsonProperty("HTG")
        public double hTG;
        @JsonProperty("HUF")
        public double hUF;
        @JsonProperty("IDR")
        public double iDR;
        @JsonProperty("ILS")
        public double iLS;
        @JsonProperty("IMP")
        public double iMP;
        @JsonProperty("INR")
        public double iNR;
        @JsonProperty("IQD")
        public double iQD;
        @JsonProperty("IRR")
        public double iRR;
        @JsonProperty("ISK")
        public double iSK;
        @JsonProperty("JEP")
        public double jEP;
        @JsonProperty("JMD")
        public double jMD;
        @JsonProperty("JOD")
        public double jOD;
        @JsonProperty("JPY")
        public double jPY;
        @JsonProperty("KES")
        public double kES;
        @JsonProperty("KGS")
        public double kGS;
        @JsonProperty("KHR")
        public double kHR;
        @JsonProperty("KID")
        public double kID;
        @JsonProperty("KMF")
        public double kMF;
        @JsonProperty("KRW")
        public double kRW;
        @JsonProperty("KWD")
        public double kWD;
        @JsonProperty("KYD")
        public double kYD;
        @JsonProperty("KZT")
        public double kZT;
        @JsonProperty("LAK")
        public double lAK;
        @JsonProperty("LBP")
        public int lBP;
        @JsonProperty("LKR")
        public double lKR;
        @JsonProperty("LRD")
        public double lRD;
        @JsonProperty("LSL")
        public double lSL;
        @JsonProperty("LYD")
        public double lYD;
        @JsonProperty("MAD")
        public double mAD;
        @JsonProperty("MDL")
        public double mDL;
        @JsonProperty("MGA")
        public double mGA;
        @JsonProperty("MKD")
        public double mKD;
        @JsonProperty("MMK")
        public double mMK;
        @JsonProperty("MNT")
        public double mNT;
        @JsonProperty("MOP")
        public double mOP;
        @JsonProperty("MRU")
        public double mRU;
        @JsonProperty("MUR")
        public double mUR;
        @JsonProperty("MVR")
        public double mVR;
        @JsonProperty("MWK")
        public double mWK;
        @JsonProperty("MXN")
        public double mXN;
        @JsonProperty("MYR")
        public double mYR;
        @JsonProperty("MZN")
        public double mZN;
        @JsonProperty("NAD")
        public double nAD;
        @JsonProperty("NGN")
        public double nGN;
        @JsonProperty("NIO")
        public double nIO;
        @JsonProperty("NOK")
        public double nOK;
        @JsonProperty("NPR")
        public double nPR;
        @JsonProperty("NZD")
        public double nZD;
        @JsonProperty("OMR")
        public double oMR;
        @JsonProperty("PAB")
        public int pAB;
        @JsonProperty("PEN")
        public double pEN;
        @JsonProperty("PGK")
        public double pGK;
        @JsonProperty("PHP")
        public double pHP;
        @JsonProperty("PKR")
        public double pKR;
        @JsonProperty("PLN")
        public double pLN;
        @JsonProperty("PYG")
        public double pYG;
        @JsonProperty("QAR")
        public double qAR;
        @JsonProperty("RON")
        public double rON;
        @JsonProperty("RSD")
        public double rSD;
        @JsonProperty("RUB")
        public double rUB;
        @JsonProperty("RWF")
        public double rWF;
        @JsonProperty("SAR")
        public double sAR;
        @JsonProperty("SBD")
        public double sBD;
        @JsonProperty("SCR")
        public double sCR;
        @JsonProperty("SDG")
        public double sDG;
        @JsonProperty("SEK")
        public double sEK;
        @JsonProperty("SGD")
        public double sGD;
        @JsonProperty("SHP")
        public double sHP;
        @JsonProperty("SLE")
        public double sLE;
        @JsonProperty("SLL")
        public double sLL;
        @JsonProperty("SOS")
        public double sOS;
        @JsonProperty("SRD")
        public double sRD;
        @JsonProperty("SSP")
        public double sSP;
        @JsonProperty("STN")
        public double sTN;
        @JsonProperty("SYP")
        public double sYP;
        @JsonProperty("SZL")
        public double sZL;
        @JsonProperty("THB")
        public double tHB;
        @JsonProperty("TJS")
        public double tJS;
        @JsonProperty("TMT")
        public double tMT;
        @JsonProperty("TND")
        public double tND;
        @JsonProperty("TOP")
        public double tOP;
        @JsonProperty("TRY")
        public double tRY;
        @JsonProperty("TTD")
        public double tTD;
        @JsonProperty("TVD")
        public double tVD;
        @JsonProperty("TWD")
        public double tWD;
        @JsonProperty("TZS")
        public double tZS;
        @JsonProperty("UAH")
        public double uAH;
        @JsonProperty("UGX")
        public double uGX;
        @JsonProperty("UYU")
        public double uYU;
        @JsonProperty("UZS")
        public double uZS;
        @JsonProperty("VES")
        public double vES;
        @JsonProperty("VND")
        public double vND;
        @JsonProperty("VUV")
        public double vUV;
        @JsonProperty("WST")
        public double wST;
        @JsonProperty("XAF")
        public double xAF;
        @JsonProperty("XCD")
        public double xCD;
        @JsonProperty("XDR")
        public double xDR;
        @JsonProperty("XOF")
        public double xOF;
        @JsonProperty("XPF")
        public double xPF;
        @JsonProperty("YER")
        public double yER;
        @JsonProperty("ZAR")
        public double zAR;
        @JsonProperty("ZMW")
        public double zMW;
        @JsonProperty("ZWL")
        public double zWL;
    }
}
