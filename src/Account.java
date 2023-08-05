public class Account {

    // FIELDS   /////////////////////////////////////////////////////////////
    private int accountId;
    private int customerId;
    private double balance;
    private AccountType accountType;
    /////////////////////////////////////////////////////////////////////////
//deneme

    // CONSTRUCTORS /////////////////////////////////////////////////////////
    public Account() {
    }

    public Account(int accountId, int customerId, AccountType accountType) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountType = accountType;
    }
    /////////////////////////////////////////////////////////////////////////


    // GETTER AND SETTER METHODS    /////////////////////////////////////////
    /** GETTER VE SETTER METODLARINI OLUŞTURUN */

    ////////////////////////////////////////////////////////////////////////////


    // PARA EKLE (DEPOSIT) METODU   ////////////////////////////////////////////
    // YATIRILACAK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    // ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ ARTMIŞ OLMALIDIR.
    public void depositToAmount(double amount) {

        /** BU METODU BankSimulation SINIFINDAKİ depositToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN*/
        /** YATIRILMAK İSTENEN TUTAR, SIFIRDAN BÜYÜK MÜ DEĞİL Mİ KONTROL EDİN*/
        /** BÜYÜKSE BAKİYEYE İLAVE EDİP KULLANICIYA MESAJ VERİN*/
        /** YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN...*/
    }
    ////////////////////////////////////////////////////////////////////////////////////////


    // PARA ÇEK (WITHDRAW) METODU   ///////////////////////////////////////////////////////
    // ÇEKİLECEK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    // ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ TUTAR KADAR AZALMIŞ OLMALIDIR.
    public void withdrawToAmount(double amount) {

        /** BU METODU BankSimulation SINIFINDAKİ withdrawToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN*/
        /** ÇEKİLMEK İSTENEN TUTAR, NEGATİF Mİ, DEĞİL Mİ KONTROL EDİN*/
        /** ÇEKİLMEK İSTENEN TUTAR BAKİYEDEN BÜYÜK MÜ, DEĞİL Mİ KONTROL EDİN    */
        /** ÇEKİLMEK İSTENEN TUTAR (amount) POZİTİFSE VE BAKİYEDEN KÜÇÜKSE, BAKİYEDEN DÜŞÜP,
         * YENİ BAKİYEYİ KULLANICIYA BİLDİRİN... */
        /** YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE YA DA BAKİYEDEN BÜYÜKSE,
         * KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN...*/
    }
    /////////////////////////////////////////////////////////////////////////////////////


    // TO STRING METODU ////////////////////////////////////////////////////////////////////
    /** TO STRING METODUNU OLUŞTURUN... */
    ////////////////////////////////////////////////////////////////////////////////////////
}
