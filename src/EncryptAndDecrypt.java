public class EncryptAndDecrypt
{
    public static void main(String[] args)
    {
        System.out.println("-----Test 1 : Encrypting Messages-----");
        Encryptor encryptor1 = new Encryptor(3, 4);
        System.out.println(encryptor1.encryptMessage("What are you doing next weekend?"));

        System.out.println();

        Encryptor encryptor2 = new Encryptor(6, 5);
        System.out.println(encryptor2.encryptMessage("This one time I was trying to do a handstand and fell backwards and landed on my shoe. It hurt! I won't try that again."));

        System.out.println();

        System.out.println("-----Test 2 : Decrypting Messages-----");
        Encryptor decryptor1 = new Encryptor(3, 2);
        System.out.println(decryptor1.decryptMessage("Ti hsiscn ofietdnia!Bl e nto helo okotAu!A"));

        System.out.println();

        Encryptor decryptor2 = new Encryptor(5, 5);
        System.out.println(decryptor2.decryptMessage("Tite hsocmi presa es  stsaneregtd see J  nfaBidomonee  d ftm.cuhe alisBr,ssaieecgllstelft!  -rAwsduA"));

        System.out.println();

        Encryptor decryptor3 = new Encryptor(6, 5);
        System.out.println(decryptor3.decryptMessage("Meottai ooufdsl rtdcsrnelh e r etWwht hhiihmselgro.nlhen    sld tmc egoehsne  otttcbous oacHusAAkoloAA?ploAA eynAA f !AA"));
        System.out.println();

        Encryptor decryptor4 = new Encryptor(9, 8);
        System.out.println(decryptor4.decryptMessage("Io ihscnongeoesofn rnn  do.cac poir rprirfnmTyhyso gahpyp ce tit,tteniis  siea o,pc gpttr rotirihmkonhneoeancveasn toee le iiwsro nononstrrtffn atttencxlseoe oitl x rfwp.yptanonh ,l,nar eI a  tmardoiiai stennnlvk ealyit real  zid rcaaaeeeatkinudsc e ndt  icxtt hpcpitoeaoaahp  xcrrnehbptceo tc t  sriird pisinoyoirn gfnpetettio.tssvehnr i eereamEonlnf lannoftert eetoite tl  unondhlctltrceeioode.en gn -r  iiitabcFbenbe eeoustlnw pr annn  patlsc uusne ,rsssedcr ycueuoheaphasdmnantel o is imla-ecoeoey rnc eyoIsotrkr rts  yeaai idtpytntibeht e hslceigdam er oe l.p ymnnbg otpests  r-dtshstb d iaoehuaeeoguset snnets ,wic   ik egrswpneflnyciogyolephesearsi dmi te lr.edcisale ,eooonsqA rmnud uncapar ai obulcsrranlt ekeeut naceehrhrtsr  eooe iymw vrcclpeikiiiaytstedzpn  shyeei dta  ddeeehgtp brribthuAyi puoosA gtit reAtioe uirAhn nnnzsAeartoae.A testudAAooc  t AA"));

        System.out.println();

        System.out.println("-----Test 3 : Making Your Own!-----");

        Encryptor makeYourOwn1 = new Encryptor(4, 3);
        System.out.println(makeYourOwn1.encryptMessage("Never gonna give you up…Never gonna let you down…Haha, sorry…"));
        System.out.println();

        Encryptor makeYourOwn2 = new Encryptor(8, 9); // Jacqueline's
        System.out.println(makeYourOwn2.decryptMessage("Atdwien    on  Aleirgaatixst. nhfa h mceemn Tain iolonesnnti  n oe vbitco hwi edrt fddm rhwaerldueinaioip tgsncetyhl.kksio e s .nundH aAgte ehnA"));
        System.out.println();

        Encryptor makeYourOwn3 = new Encryptor(3, 5); // Jay Li's
        System.out.println(makeYourOwn3.decryptMessage("I isMlnrl’.etMr BAtEPhS eTC  SAcA hAteAerAa?A"));
        System.out.println();
    }
}
