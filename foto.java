package io.kodular.supersugiman.SIMPELSAK22;

import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.FragmentTransaction;
import com.KIO4_Base64.KIO4_Base64;
import com.ghostfox.SimpleBase64;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Camera;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Decoration;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.MakeroidCardView;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.SpaceView;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Web;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import com.microsoft.appcenter.http.DefaultHttpClient;
import com.puravidaapps.TaifunImage;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.AddOp;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import org.jose4j.jws.AlgorithmIdentifiers;
/* compiled from: foto.yail */
/* loaded from: classes.dex */
public class foto extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit100;
    static final PairWithPosition Lit101;
    static final PairWithPosition Lit102;
    static final PairWithPosition Lit103;
    static final SimpleSymbol Lit104;
    static final PairWithPosition Lit105;
    static final SimpleSymbol Lit106;
    static final SimpleSymbol Lit107;
    static final PairWithPosition Lit108;
    static final PairWithPosition Lit109;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit110;
    static final SimpleSymbol Lit111;
    static final SimpleSymbol Lit112;
    static final SimpleSymbol Lit113;
    static final SimpleSymbol Lit114;
    static final SimpleSymbol Lit115;
    static final PairWithPosition Lit116;
    static final PairWithPosition Lit117;
    static final SimpleSymbol Lit118;
    static final PairWithPosition Lit119;
    static final SimpleSymbol Lit12;
    static final PairWithPosition Lit120;
    static final PairWithPosition Lit121;
    static final SimpleSymbol Lit122;
    static final FString Lit123;
    static final SimpleSymbol Lit124;
    static final FString Lit125;
    static final FString Lit126;
    static final FString Lit127;
    static final FString Lit128;
    static final SimpleSymbol Lit129;
    static final SimpleSymbol Lit13;
    static final FString Lit130;
    static final FString Lit131;
    static final SimpleSymbol Lit132;
    static final FString Lit133;
    static final SimpleSymbol Lit134;
    static final SimpleSymbol Lit135;
    static final SimpleSymbol Lit136;
    static final FString Lit137;
    static final SimpleSymbol Lit138;
    static final FString Lit139;
    static final SimpleSymbol Lit14;
    static final FString Lit140;
    static final FString Lit141;
    static final SimpleSymbol Lit142;
    static final SimpleSymbol Lit143;
    static final SimpleSymbol Lit144;
    static final IntNum Lit145;
    static final IntNum Lit146;
    static final PairWithPosition Lit147;
    static final SimpleSymbol Lit148;
    static final PairWithPosition Lit149;
    static final SimpleSymbol Lit15;
    static final PairWithPosition Lit150;
    static final PairWithPosition Lit151;
    static final PairWithPosition Lit152;
    static final PairWithPosition Lit153;
    static final SimpleSymbol Lit154;
    static final SimpleSymbol Lit155;
    static final FString Lit156;
    static final FString Lit157;
    static final SimpleSymbol Lit158;
    static final IntNum Lit159;
    static final SimpleSymbol Lit16;
    static final PairWithPosition Lit160;
    static final SimpleSymbol Lit161;
    static final SimpleSymbol Lit162;
    static final SimpleSymbol Lit163;
    static final SimpleSymbol Lit164;
    static final PairWithPosition Lit165;
    static final PairWithPosition Lit166;
    static final SimpleSymbol Lit167;
    static final PairWithPosition Lit168;
    static final SimpleSymbol Lit17;
    static final SimpleSymbol Lit18;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit23;
    static final IntNum Lit24;
    static final IntNum Lit25;
    static final PairWithPosition Lit26;
    static final IntNum Lit27;
    static final PairWithPosition Lit28;
    static final PairWithPosition Lit29;
    static final SimpleSymbol Lit3;
    static final IntNum Lit30;
    static final PairWithPosition Lit31;
    static final PairWithPosition Lit32;
    static final IntNum Lit33;
    static final PairWithPosition Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final FString Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final IntNum Lit40;
    static final SimpleSymbol Lit41;
    static final SimpleSymbol Lit42;
    static final SimpleSymbol Lit43;
    static final IntNum Lit44;
    static final FString Lit45;
    static final FString Lit46;
    static final SimpleSymbol Lit47;
    static final FString Lit48;
    static final FString Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final SimpleSymbol Lit51;
    static final IntNum Lit52;
    static final SimpleSymbol Lit53;
    static final SimpleSymbol Lit54;
    static final SimpleSymbol Lit55;
    static final IntNum Lit56;
    static final FString Lit57;
    static final FString Lit58;
    static final IntNum Lit59;
    static final SimpleSymbol Lit6;
    static final FString Lit60;
    static final FString Lit61;
    static final SimpleSymbol Lit62;
    static final FString Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final FString Lit66;
    static final FString Lit67;
    static final SimpleSymbol Lit68;
    static final SimpleSymbol Lit69;
    static final SimpleSymbol Lit7;
    static final IntNum Lit70;
    static final SimpleSymbol Lit71;
    static final FString Lit72;
    static final SimpleSymbol Lit73;
    static final SimpleSymbol Lit74;
    static final SimpleSymbol Lit75;
    static final SimpleSymbol Lit76;
    static final FString Lit77;
    static final SimpleSymbol Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final FString Lit80;
    static final SimpleSymbol Lit81;
    static final SimpleSymbol Lit82;
    static final IntNum Lit83;
    static final FString Lit84;
    static final FString Lit85;
    static final SimpleSymbol Lit86;
    static final FString Lit87;
    static final FString Lit88;
    static final SimpleSymbol Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final FString Lit91;
    static final SimpleSymbol Lit92;
    static final FString Lit93;
    static final FString Lit94;
    static final SimpleSymbol Lit95;
    static final IntNum Lit96;
    static final FString Lit97;
    static final PairWithPosition Lit98;
    static final SimpleSymbol Lit99;
    public static foto foto;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button ButtonCamera1;
    public final ModuleMethod ButtonCamera1$Click;
    public Button ButtonKirim;
    public final ModuleMethod ButtonKirim$Click;
    public Camera Camera1;
    public final ModuleMethod Camera1$AfterPicture;
    public MakeroidCardView Card_View1;
    public Clock Clock1;
    public Decoration Decoration1;
    public HorizontalArrangement Horizontal_Arrangement1;
    public HorizontalArrangement Horizontal_Arrangement2;
    public HorizontalArrangement Horizontal_Arrangement3;
    public Image Image1;
    public KIO4_Base64 KIO4_Base641;
    public final ModuleMethod KIO4_Base641$GotString;
    public Notifier Notifier1;
    public SimpleBase64 SimpleBase641;
    public SpaceView Space1;
    public SpaceView Space2;
    public SpaceView Space3;
    public SpaceView Space4;
    public SpaceView Space5;
    public TaifunImage TaifunImage1;
    public TextBox Text_BoxNKS;
    public TextBox Text_BoxNUS;
    public Web Web1;
    public final ModuleMethod Web1$GotText;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod foto$Initialize;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    static final SimpleSymbol Lit190 = (SimpleSymbol) new SimpleSymbol("component").readResolve();
    static final SimpleSymbol Lit189 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
    static final SimpleSymbol Lit188 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
    static final SimpleSymbol Lit187 = (SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve();
    static final SimpleSymbol Lit186 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
    static final SimpleSymbol Lit185 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
    static final SimpleSymbol Lit184 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    static final SimpleSymbol Lit183 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
    static final SimpleSymbol Lit182 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
    static final SimpleSymbol Lit181 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
    static final SimpleSymbol Lit180 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
    static final SimpleSymbol Lit179 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
    static final SimpleSymbol Lit178 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
    static final SimpleSymbol Lit177 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
    static final SimpleSymbol Lit176 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
    static final SimpleSymbol Lit175 = (SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve();
    static final FString Lit174 = new FString("com.google.appinventor.components.runtime.Clock");
    static final FString Lit173 = new FString("com.google.appinventor.components.runtime.Clock");
    static final FString Lit172 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit171 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit170 = (SimpleSymbol) new SimpleSymbol("GotText").readResolve();
    static final SimpleSymbol Lit169 = (SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve();

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit12 = simpleSymbol;
        Lit168 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 815880), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 815875), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 815869);
        Lit167 = (SimpleSymbol) new SimpleSymbol("ShowMessageDialog").readResolve();
        Lit166 = PairWithPosition.make(Lit189, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 815684);
        SimpleSymbol simpleSymbol2 = Lit12;
        SimpleSymbol simpleSymbol3 = Lit12;
        SimpleSymbol simpleSymbol4 = Lit12;
        SimpleSymbol simpleSymbol5 = Lit12;
        SimpleSymbol simpleSymbol6 = (SimpleSymbol) new SimpleSymbol("boolean").readResolve();
        Lit19 = simpleSymbol6;
        Lit165 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol6, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 815578), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 815573), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 815568), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 815563), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 815557);
        Lit164 = (SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve();
        Lit163 = (SimpleSymbol) new SimpleSymbol("DismissProgressDialog").readResolve();
        Lit162 = (SimpleSymbol) new SimpleSymbol("HideKeyboard").readResolve();
        Lit161 = (SimpleSymbol) new SimpleSymbol("$responseContent").readResolve();
        Lit160 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 815207), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 815202);
        Lit159 = IntNum.make(200);
        Lit158 = (SimpleSymbol) new SimpleSymbol("$responseCode").readResolve();
        Lit157 = new FString("com.google.appinventor.components.runtime.Web");
        Lit156 = new FString("com.google.appinventor.components.runtime.Web");
        Lit155 = (SimpleSymbol) new SimpleSymbol("AfterPicture").readResolve();
        Lit154 = (SimpleSymbol) new SimpleSymbol("Camera1$AfterPicture").readResolve();
        Lit153 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 787163), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 787158);
        SimpleSymbol simpleSymbol7 = Lit12;
        SimpleSymbol simpleSymbol8 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit41 = simpleSymbol8;
        Lit152 = PairWithPosition.make(simpleSymbol7, PairWithPosition.make(simpleSymbol8, PairWithPosition.make(Lit41, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 787049), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 787042), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 787036);
        Lit151 = PairWithPosition.make(Lit41, PairWithPosition.make(Lit41, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 787019), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 787011);
        Lit150 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 786990);
        Lit149 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 786753);
        Lit148 = (SimpleSymbol) new SimpleSymbol("EncodeImage").readResolve();
        Lit147 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit41, PairWithPosition.make(Lit41, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 786622), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 786615), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 786609);
        Lit146 = IntNum.make(400);
        Lit145 = IntNum.make(600);
        Lit144 = (SimpleSymbol) new SimpleSymbol("Resize").readResolve();
        Lit143 = (SimpleSymbol) new SimpleSymbol("$image").readResolve();
        Lit142 = (SimpleSymbol) new SimpleSymbol("Picture").readResolve();
        Lit141 = new FString("com.google.appinventor.components.runtime.Camera");
        Lit140 = new FString("com.google.appinventor.components.runtime.Camera");
        Lit139 = new FString("com.puravidaapps.TaifunImage");
        Lit138 = (SimpleSymbol) new SimpleSymbol("TaifunImage1").readResolve();
        Lit137 = new FString("com.puravidaapps.TaifunImage");
        Lit136 = (SimpleSymbol) new SimpleSymbol("GotString").readResolve();
        Lit135 = (SimpleSymbol) new SimpleSymbol("KIO4_Base641$GotString").readResolve();
        Lit134 = (SimpleSymbol) new SimpleSymbol("$string").readResolve();
        Lit133 = new FString("com.KIO4_Base64.KIO4_Base64");
        Lit132 = (SimpleSymbol) new SimpleSymbol("KIO4_Base641").readResolve();
        Lit131 = new FString("com.KIO4_Base64.KIO4_Base64");
        Lit130 = new FString("com.ghostfox.SimpleBase64");
        Lit129 = (SimpleSymbol) new SimpleSymbol("SimpleBase641").readResolve();
        Lit128 = new FString("com.ghostfox.SimpleBase64");
        Lit127 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit126 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit125 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit124 = (SimpleSymbol) new SimpleSymbol("Space5").readResolve();
        Lit123 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit122 = (SimpleSymbol) new SimpleSymbol("ButtonKirim$Click").readResolve();
        Lit121 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648913);
        Lit120 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648896), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648891), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648886), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648881), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648876), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648870);
        Lit119 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648859);
        Lit118 = (SimpleSymbol) new SimpleSymbol("UriEncode").readResolve();
        Lit117 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648705), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648700), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648695), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648690), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648685), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648680), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648674);
        Lit116 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("InstantInTime").readResolve(), PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648635), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648620);
        Lit115 = (SimpleSymbol) new SimpleSymbol("Now").readResolve();
        Lit114 = (SimpleSymbol) new SimpleSymbol("FormatDate").readResolve();
        Lit113 = (SimpleSymbol) new SimpleSymbol("Clock1").readResolve();
        Lit112 = (SimpleSymbol) new SimpleSymbol("PostText").readResolve();
        Lit111 = (SimpleSymbol) new SimpleSymbol("Url").readResolve();
        Lit110 = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit109 = PairWithPosition.make(Lit189, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 648019);
        Lit108 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 647995), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 647990);
        Lit107 = (SimpleSymbol) new SimpleSymbol("RequestHeaders").readResolve();
        Lit106 = (SimpleSymbol) new SimpleSymbol("Web1").readResolve();
        Lit105 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 647770), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 647764);
        Lit104 = (SimpleSymbol) new SimpleSymbol("ShowProgressDialog").readResolve();
        Lit103 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 647635);
        Lit102 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 647507);
        Lit101 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 647396);
        Lit100 = (SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve();
        Lit99 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit98 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 647268);
        Lit97 = new FString("com.google.appinventor.components.runtime.Button");
        Lit96 = IntNum.make(new int[]{-32892943});
        Lit95 = (SimpleSymbol) new SimpleSymbol("ButtonKirim").readResolve();
        Lit94 = new FString("com.google.appinventor.components.runtime.Button");
        Lit93 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit92 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement3").readResolve();
        Lit91 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit90 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit89 = (SimpleSymbol) new SimpleSymbol("Space4").readResolve();
        Lit88 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit87 = new FString("com.google.appinventor.components.runtime.Image");
        Lit86 = (SimpleSymbol) new SimpleSymbol("Image1").readResolve();
        Lit85 = new FString("com.google.appinventor.components.runtime.Image");
        Lit84 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit83 = IntNum.make(-1020);
        Lit82 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit81 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement2").readResolve();
        Lit80 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit79 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit78 = (SimpleSymbol) new SimpleSymbol("Space3").readResolve();
        Lit77 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit76 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit75 = (SimpleSymbol) new SimpleSymbol("ButtonCamera1$Click").readResolve();
        Lit74 = (SimpleSymbol) new SimpleSymbol("TakePicture").readResolve();
        Lit73 = (SimpleSymbol) new SimpleSymbol("Camera1").readResolve();
        Lit72 = new FString("com.google.appinventor.components.runtime.Button");
        Lit71 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit70 = IntNum.make(new int[]{-32892943});
        Lit69 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit68 = (SimpleSymbol) new SimpleSymbol("ButtonCamera1").readResolve();
        Lit67 = new FString("com.google.appinventor.components.runtime.Button");
        Lit66 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit65 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement1").readResolve();
        Lit64 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit63 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit62 = (SimpleSymbol) new SimpleSymbol("Space2").readResolve();
        Lit61 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit60 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit59 = IntNum.make(new int[]{-18672371});
        Lit58 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit57 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit56 = IntNum.make(new int[]{-18672371});
        Lit55 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit54 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit53 = (SimpleSymbol) new SimpleSymbol("ReadOnly").readResolve();
        Lit52 = IntNum.make(17);
        Lit51 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit50 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit49 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit48 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit47 = (SimpleSymbol) new SimpleSymbol("Space1").readResolve();
        Lit46 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit45 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit44 = IntNum.make(-2);
        Lit43 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit42 = (SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve();
        Lit40 = IntNum.make(3);
        Lit39 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit38 = (SimpleSymbol) new SimpleSymbol("Card_View1").readResolve();
        Lit37 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit36 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit35 = (SimpleSymbol) new SimpleSymbol("foto$Initialize").readResolve();
        Lit34 = PairWithPosition.make(Lit110, PairWithPosition.make(Lit41, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 111481), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 111475);
        Lit33 = IntNum.make(2);
        Lit32 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 111456), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 111450);
        Lit31 = PairWithPosition.make(Lit110, PairWithPosition.make(Lit41, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 111168), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 111162);
        Lit30 = IntNum.make(1);
        Lit29 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 111143), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 111137);
        Lit28 = PairWithPosition.make(Lit190, PairWithPosition.make(Lit41, PairWithPosition.make(Lit41, PairWithPosition.make(Lit19, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 110880), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 110873), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 110866), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 110855);
        Lit27 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit26 = PairWithPosition.make(Lit190, PairWithPosition.make(Lit41, PairWithPosition.make(Lit41, PairWithPosition.make(Lit19, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 110734), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 110727), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 110720), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/foto.yail", 110709);
        Lit25 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit24 = IntNum.make(-1);
        Lit23 = (SimpleSymbol) new SimpleSymbol("SetShape").readResolve();
        Lit22 = (SimpleSymbol) new SimpleSymbol("Decoration1").readResolve();
        Lit21 = (SimpleSymbol) new SimpleSymbol("TitleBarSubTitle").readResolve();
        Lit20 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit18 = (SimpleSymbol) new SimpleSymbol("Scrollable").readResolve();
        Lit17 = (SimpleSymbol) new SimpleSymbol("ReceiveSharedText").readResolve();
        Lit16 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit15 = (SimpleSymbol) new SimpleSymbol("AppId").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("AboutScreenTitle").readResolve();
        Lit13 = (SimpleSymbol) new SimpleSymbol("Text_BoxNUS").readResolve();
        Lit11 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit10 = (SimpleSymbol) new SimpleSymbol("Text_BoxNKS").readResolve();
        Lit9 = (SimpleSymbol) new SimpleSymbol("p$clean").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("g$fileBase64string").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("g$Respon").readResolve();
        Lit6 = (SimpleSymbol) new SimpleSymbol("g$vImageAsBase").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("g$vImageAsBase64").readResolve();
        Lit4 = (SimpleSymbol) new SimpleSymbol("g$vImageFormat").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("g$image").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("foto").readResolve();
    }

    public foto() {
        ModuleInfo.register(this);
        frame frameVar = new frame();
        frameVar.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frameVar, 1, Lit175, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frameVar, 2, Lit176, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frameVar, 3, Lit177, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 4, Lit178, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 6, Lit179, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frameVar, 7, Lit180, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frameVar, 8, Lit181, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frameVar, 9, Lit182, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frameVar, 10, Lit183, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frameVar, 11, Lit184, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frameVar, 12, Lit185, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frameVar, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frameVar, 14, Lit186, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frameVar, 15, Lit187, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frameVar, 16, Lit188, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frameVar, 17, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6458243650290595638.scm:615");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frameVar, 18, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frameVar, 19, null, 0);
        lambda$Fn3 = new ModuleMethod(frameVar, 20, null, 0);
        lambda$Fn4 = new ModuleMethod(frameVar, 21, null, 0);
        lambda$Fn5 = new ModuleMethod(frameVar, 22, null, 0);
        lambda$Fn6 = new ModuleMethod(frameVar, 23, null, 0);
        lambda$Fn7 = new ModuleMethod(frameVar, 24, null, 0);
        lambda$Fn8 = new ModuleMethod(frameVar, 25, null, 0);
        lambda$Fn10 = new ModuleMethod(frameVar, 26, null, 0);
        lambda$Fn9 = new ModuleMethod(frameVar, 27, null, 0);
        lambda$Fn11 = new ModuleMethod(frameVar, 28, null, 0);
        this.foto$Initialize = new ModuleMethod(frameVar, 29, Lit35, 0);
        lambda$Fn12 = new ModuleMethod(frameVar, 30, null, 0);
        lambda$Fn13 = new ModuleMethod(frameVar, 31, null, 0);
        lambda$Fn14 = new ModuleMethod(frameVar, 32, null, 0);
        lambda$Fn15 = new ModuleMethod(frameVar, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(frameVar, 34, null, 0);
        lambda$Fn17 = new ModuleMethod(frameVar, 35, null, 0);
        lambda$Fn18 = new ModuleMethod(frameVar, 36, null, 0);
        lambda$Fn19 = new ModuleMethod(frameVar, 37, null, 0);
        lambda$Fn20 = new ModuleMethod(frameVar, 38, null, 0);
        lambda$Fn21 = new ModuleMethod(frameVar, 39, null, 0);
        this.ButtonCamera1$Click = new ModuleMethod(frameVar, 40, Lit75, 0);
        lambda$Fn22 = new ModuleMethod(frameVar, 41, null, 0);
        lambda$Fn23 = new ModuleMethod(frameVar, 42, null, 0);
        lambda$Fn24 = new ModuleMethod(frameVar, 43, null, 0);
        lambda$Fn25 = new ModuleMethod(frameVar, 44, null, 0);
        lambda$Fn26 = new ModuleMethod(frameVar, 45, null, 0);
        lambda$Fn27 = new ModuleMethod(frameVar, 46, null, 0);
        this.ButtonKirim$Click = new ModuleMethod(frameVar, 47, Lit122, 0);
        this.KIO4_Base641$GotString = new ModuleMethod(frameVar, 48, Lit135, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Camera1$AfterPicture = new ModuleMethod(frameVar, 49, Lit154, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Web1$GotText = new ModuleMethod(frameVar, 50, Lit169, 16388);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th;
        CallContext callContext = CallContext.getInstance();
        Consumer consumer = callContext.consumer;
        callContext.consumer = VoidConsumer.instance;
        try {
            run(callContext);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(callContext, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        runtime.$instance.run();
        this.$Stdebug$Mnform$St = Boolean.FALSE;
        this.form$Mnenvironment = Environment.make(Lit0.toString());
        FString stringAppend = strings.stringAppend(Lit0.toString(), "-global-vars");
        this.global$Mnvar$Mnenvironment = Environment.make(stringAppend == null ? null : stringAppend.toString());
        foto = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, ""), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit4, ""), $result);
        } else {
            addToGlobalVars(Lit4, lambda$Fn3);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit5, ""), $result);
        } else {
            addToGlobalVars(Lit5, lambda$Fn4);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit6, ""), $result);
        } else {
            addToGlobalVars(Lit6, lambda$Fn5);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit7, ""), $result);
        } else {
            addToGlobalVars(Lit7, lambda$Fn6);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit8, ""), $result);
        } else {
            addToGlobalVars(Lit8, lambda$Fn7);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit9, lambda$Fn8), $result);
        } else {
            addToGlobalVars(Lit9, lambda$Fn9);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "SIMPEL SAKERNAS", Lit12);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "5510172111798272", Lit12);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "SIMPELSAK22", Lit12);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit17, AlgorithmIdentifiers.NONE, Lit12);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Boolean.TRUE, Lit19);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "SIMPEL SAK FEB 2022", Lit12);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "Ambil Foto Blok IV", Lit12), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn11));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit35, this.foto$Initialize);
        } else {
            addToFormEnvironment(Lit35, this.foto$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "foto", "Initialize");
        } else {
            addToEvents(Lit0, Lit36);
        }
        this.Card_View1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit37, Lit38, lambda$Fn12), $result);
        } else {
            addToComponents(Lit0, Lit45, Lit38, lambda$Fn13);
        }
        this.Space1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit46, Lit47, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit38, Lit48, Lit47, Boolean.FALSE);
        }
        this.Text_BoxNKS = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit49, Lit10, lambda$Fn14), $result);
        } else {
            addToComponents(Lit38, Lit57, Lit10, lambda$Fn15);
        }
        this.Text_BoxNUS = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit58, Lit13, lambda$Fn16), $result);
        } else {
            addToComponents(Lit38, Lit60, Lit13, lambda$Fn17);
        }
        this.Space2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit61, Lit62, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit63, Lit62, Boolean.FALSE);
        }
        this.Horizontal_Arrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit64, Lit65, lambda$Fn18), $result);
        } else {
            addToComponents(Lit0, Lit66, Lit65, lambda$Fn19);
        }
        this.ButtonCamera1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit65, Lit67, Lit68, lambda$Fn20), $result);
        } else {
            addToComponents(Lit65, Lit72, Lit68, lambda$Fn21);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit75, this.ButtonCamera1$Click);
        } else {
            addToFormEnvironment(Lit75, this.ButtonCamera1$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonCamera1", "Click");
        } else {
            addToEvents(Lit68, Lit76);
        }
        this.Space3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit77, Lit78, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit79, Lit78, Boolean.FALSE);
        }
        this.Horizontal_Arrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit80, Lit81, lambda$Fn22), $result);
        } else {
            addToComponents(Lit0, Lit84, Lit81, lambda$Fn23);
        }
        this.Image1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit81, Lit85, Lit86, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit81, Lit87, Lit86, Boolean.FALSE);
        }
        this.Space4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit88, Lit89, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit90, Lit89, Boolean.FALSE);
        }
        this.Horizontal_Arrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit91, Lit92, lambda$Fn24), $result);
        } else {
            addToComponents(Lit0, Lit93, Lit92, lambda$Fn25);
        }
        this.ButtonKirim = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit92, Lit94, Lit95, lambda$Fn26), $result);
        } else {
            addToComponents(Lit92, Lit97, Lit95, lambda$Fn27);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit122, this.ButtonKirim$Click);
        } else {
            addToFormEnvironment(Lit122, this.ButtonKirim$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonKirim", "Click");
        } else {
            addToEvents(Lit95, Lit76);
        }
        this.Space5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit123, Lit124, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit125, Lit124, Boolean.FALSE);
        }
        this.Decoration1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit126, Lit22, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit127, Lit22, Boolean.FALSE);
        }
        this.SimpleBase641 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit128, Lit129, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit130, Lit129, Boolean.FALSE);
        }
        this.KIO4_Base641 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit131, Lit132, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit133, Lit132, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit135, this.KIO4_Base641$GotString);
        } else {
            addToFormEnvironment(Lit135, this.KIO4_Base641$GotString);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "KIO4_Base641", "GotString");
        } else {
            addToEvents(Lit132, Lit136);
        }
        this.TaifunImage1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit137, Lit138, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit139, Lit138, Boolean.FALSE);
        }
        this.Camera1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit140, Lit73, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit141, Lit73, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit154, this.Camera1$AfterPicture);
        } else {
            addToFormEnvironment(Lit154, this.Camera1$AfterPicture);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Camera1", "AfterPicture");
        } else {
            addToEvents(Lit73, Lit155);
        }
        this.Web1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit156, Lit106, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit157, Lit106, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit169, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit169, this.Web1$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit106, Lit170);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit171, Lit99, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit172, Lit99, Boolean.FALSE);
        }
        this.Clock1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit173, Lit113, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit174, Lit113, Boolean.FALSE);
        }
        runtime.initRuntime();
    }

    static String lambda3() {
        return "";
    }

    static String lambda4() {
        return "";
    }

    static String lambda5() {
        return "";
    }

    static String lambda6() {
        return "";
    }

    static String lambda7() {
        return "";
    }

    /* compiled from: foto.yail */
    /* loaded from: classes.dex */
    public class frame extends ModuleBody {
        foto $main;

        @Override // gnu.expr.ModuleBody
        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 17:
                    return foto.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return foto.lambda3();
                case 20:
                    return foto.lambda4();
                case 21:
                    return foto.lambda5();
                case 22:
                    return foto.lambda6();
                case 23:
                    return foto.lambda7();
                case 24:
                    return foto.lambda8();
                case 25:
                    return foto.lambda9();
                case 26:
                    return foto.lambda11();
                case 27:
                    return foto.lambda10();
                case 28:
                    return foto.lambda12();
                case 29:
                    return this.$main.foto$Initialize();
                case 30:
                    return foto.lambda13();
                case 31:
                    return foto.lambda14();
                case 32:
                    return foto.lambda15();
                case 33:
                    return foto.lambda16();
                case 34:
                    return foto.lambda17();
                case 35:
                    return foto.lambda18();
                case 36:
                    return foto.lambda19();
                case 37:
                    return foto.lambda20();
                case 38:
                    return foto.lambda21();
                case 39:
                    return foto.lambda22();
                case 40:
                    return this.$main.ButtonCamera1$Click();
                case 41:
                    return foto.lambda23();
                case 42:
                    return foto.lambda24();
                case 43:
                    return foto.lambda25();
                case 44:
                    return foto.lambda26();
                case 45:
                    return foto.lambda27();
                case 46:
                    return foto.lambda28();
                case 47:
                    return this.$main.ButtonKirim$Click();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 17:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 4:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 6:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 11:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    if (obj instanceof foto) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 48:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 49:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 3:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.value2 = obj2;
                        callContext.proc = moduleMethod;
                        callContext.pc = 2;
                        return 0;
                    }
                    return -786431;
                case 4:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.value2 = obj2;
                        callContext.proc = moduleMethod;
                        callContext.pc = 2;
                        return 0;
                    }
                    return -786431;
                case 5:
                case 6:
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
                case 7:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.value2 = obj2;
                        callContext.proc = moduleMethod;
                        callContext.pc = 2;
                        return 0;
                    }
                    return -786431;
                case 8:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 16:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 14:
                    if (obj instanceof foto) {
                        callContext.value1 = obj;
                        if (obj2 instanceof Component) {
                            callContext.value2 = obj2;
                            if (obj3 instanceof String) {
                                callContext.value3 = obj3;
                                if (obj4 instanceof String) {
                                    callContext.value4 = obj4;
                                    callContext.proc = moduleMethod;
                                    callContext.pc = 4;
                                    return 0;
                                }
                                return -786428;
                            }
                            return -786429;
                        }
                        return -786430;
                    }
                    return -786431;
                case 15:
                    if (obj instanceof foto) {
                        callContext.value1 = obj;
                        if (obj2 instanceof Component) {
                            callContext.value2 = obj2;
                            if (obj3 instanceof String) {
                                callContext.value3 = obj3;
                                if (1 != 0) {
                                    callContext.value4 = obj4;
                                    callContext.proc = moduleMethod;
                                    callContext.pc = 4;
                                    return 0;
                                }
                                return -786428;
                            }
                            return -786429;
                        }
                        return -786430;
                    }
                    return -786431;
                case 50:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case 6:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case 11:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 12:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 13:
                    this.$main.processException(obj);
                    return Values.empty;
                case 48:
                    return this.$main.KIO4_Base641$GotString(obj);
                case 49:
                    return this.$main.Camera1$AfterPicture(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 9:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 14:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    this.$main.dispatchGenericEvent((Component) obj, (String) obj2, obj3 != Boolean.FALSE, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                case 50:
                    return this.$main.Web1$GotText(obj, obj2, obj3, obj4);
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 3:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 5:
                case 6:
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    return super.apply2(moduleMethod, obj, obj2);
                case 7:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 8:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 10:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 16:
                    return this.$main.lookupHandler(obj, obj2);
            }
        }
    }

    static String lambda8() {
        return "";
    }

    static Procedure lambda10() {
        return lambda$Fn10;
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, "", Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit11, "", Lit12);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, "", Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit11, "", Lit12);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "SIMPEL SAKERNAS", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "5510172111798272", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "SIMPELSAK22", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit17, AlgorithmIdentifiers.NONE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Boolean.TRUE, Lit19);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "SIMPEL SAK FEB 2022", Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "Ambil Foto Blok IV", Lit12);
    }

    public Object foto$Initialize() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit22, Lit23, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit10), Lit24, Lit25, Boolean.TRUE), Lit26);
        runtime.callComponentMethod(Lit22, Lit23, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit13), Lit24, Lit27, Boolean.TRUE), Lit28);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit11, runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), "##"), Lit29, "split"), Lit30), Lit31, "select list item"), Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit11, runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), "##"), Lit32, "split"), Lit33), Lit34, "select list item"), Lit12);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Lit40, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit42, Lit33, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit43, Lit44, Lit41);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Lit40, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit42, Lit33, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit43, Lit44, Lit41);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit50, Boolean.TRUE, Lit19);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit51, Lit52, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit53, Boolean.TRUE, Lit19);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit54, Lit30, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit55, Lit56, Lit41);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit10, Lit50, Boolean.TRUE, Lit19);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit51, Lit52, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit53, Boolean.TRUE, Lit19);
        runtime.setAndCoerceProperty$Ex(Lit10, Lit54, Lit30, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit10, Lit55, Lit56, Lit41);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit13, Lit50, Boolean.TRUE, Lit19);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit51, Lit52, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit53, Boolean.TRUE, Lit19);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit54, Lit30, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit55, Lit59, Lit41);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit13, Lit50, Boolean.TRUE, Lit19);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit51, Lit52, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit53, Boolean.TRUE, Lit19);
        runtime.setAndCoerceProperty$Ex(Lit13, Lit54, Lit30, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit13, Lit55, Lit59, Lit41);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit39, Lit40, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit42, Lit33, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit43, Lit44, Lit41);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit39, Lit40, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit42, Lit33, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit43, Lit44, Lit41);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit69, Lit70, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit68, Lit51, Lit52, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit68, Lit71, Lit30, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit11, "AMBIL FOTO", Lit12);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit69, Lit70, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit68, Lit51, Lit52, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit68, Lit71, Lit30, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit11, "AMBIL FOTO", Lit12);
    }

    public Object ButtonCamera1$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit73, Lit74, LList.Empty, LList.Empty);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit81, Lit39, Lit40, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit42, Lit33, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit82, Lit83, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit43, Lit44, Lit41);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit81, Lit39, Lit40, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit42, Lit33, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit82, Lit83, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit43, Lit44, Lit41);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit92, Lit39, Lit40, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit92, Lit43, Lit44, Lit41);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit92, Lit39, Lit40, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit92, Lit43, Lit44, Lit41);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit95, Lit69, Lit96, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit95, Lit50, Boolean.TRUE, Lit19);
        runtime.setAndCoerceProperty$Ex(Lit95, Lit51, Lit52, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit95, Lit71, Lit30, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit95, Lit11, "KIRIM", Lit12);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit95, Lit69, Lit96, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit95, Lit50, Boolean.TRUE, Lit19);
        runtime.setAndCoerceProperty$Ex(Lit95, Lit51, Lit52, Lit41);
        runtime.setAndCoerceProperty$Ex(Lit95, Lit71, Lit30, Lit41);
        return runtime.setAndCoerceProperty$Ex(Lit95, Lit11, "KIRIM", Lit12);
    }

    public Object ButtonKirim$Click() {
        Object callComponentMethod;
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit10, Lit11)), Lit98, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit99, Lit100, LList.list1("Isian tidak boleh kosong"), Lit101);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit13, Lit11)), Lit102, "is text empty?") != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit99, Lit100, LList.list1("Isian tidak boleh kosong"), Lit103);
        } else {
            runtime.callComponentMethod(Lit99, Lit104, LList.list2("Sabar Yaaa....", "Uploading Foto"), Lit105);
            runtime.setAndCoerceProperty$Ex(Lit106, Lit107, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list2(DefaultHttpClient.CONTENT_TYPE_KEY, "application/x-www-form-urlencoded"), Lit108, "make a list")), Lit109, "make a list"), Lit110);
            runtime.setAndCoerceProperty$Ex(Lit106, Lit111, "https://script.google.com/macros/s/AKfycbzbVLdj1B8dGJ4V0ISaxKwfC7_FinrdRbECS19wAMX0ZMYIR7OYjfU6wD0Yfy6wwj04dQ/exec", Lit12);
            SimpleSymbol simpleSymbol = Lit106;
            SimpleSymbol simpleSymbol2 = Lit112;
            ModuleMethod moduleMethod = strings.string$Mnappend;
            Pair list1 = LList.list1("filename=");
            ModuleMethod moduleMethod2 = strings.string$Mnappend;
            Pair list12 = LList.list1(runtime.get$Mnproperty.apply2(Lit13, Lit11));
            LList.chain1(LList.chain1(LList.chain4(list12, "   ", runtime.get$Mnproperty.apply2(Lit10, Lit11), "  /  ", runtime.callComponentMethod(Lit113, Lit114, LList.list2(runtime.callComponentMethod(Lit113, Lit115, LList.Empty, LList.Empty), "dd-MM-yyyy-hh-mm-ss"), Lit116)), "."), runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St));
            LList.chain1(LList.chain4(list1, runtime.callYailPrimitive(moduleMethod2, list12, Lit117, "join"), "&imageformat=", runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St), "&file="), runtime.callComponentMethod(Lit106, Lit118, LList.list1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit119));
            callComponentMethod = runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod, list1, Lit120, "join")), Lit121);
        }
        return callComponentMethod;
    }

    public Object KIO4_Base641$GotString(Object $string) {
        Object $string2 = runtime.sanitizeComponentData($string);
        runtime.setThisForm();
        return runtime.addGlobalVarToCurrentFormEnvironment(Lit8, $string2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit134), " is not bound in the current context"), "Unbound Variable") : $string2);
    }

    public Object Camera1$AfterPicture(Object $image) {
        Object $image2 = runtime.sanitizeComponentData($image);
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit86, Lit142, $image2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit143), " is not bound in the current context"), "Unbound Variable") : $image2, Lit12);
        runtime.callComponentMethod(Lit138, Lit144, LList.list3($image2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit143), " is not bound in the current context"), "Unbound Variable") : $image2, Lit145, Lit146), Lit147);
        runtime.addGlobalVarToCurrentFormEnvironment(Lit5, runtime.callComponentMethod(Lit129, Lit148, LList.list1($image2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit143), " is not bound in the current context"), "Unbound Variable") : $image2), Lit149));
        runtime.addGlobalVarToCurrentFormEnvironment(Lit4, runtime.callYailPrimitive(runtime.string$Mnsubstring, LList.list3($image2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit143), " is not bound in the current context"), "Unbound Variable") : $image2, runtime.callYailPrimitive(AddOp.$Mn, LList.list2(runtime.callYailPrimitive(strings.string$Mnlength, LList.list1($image2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit143), " is not bound in the current context"), "Unbound Variable") : $image2), Lit150, "length"), Lit33), Lit151, "-"), Lit40), Lit152, "segment"));
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St), "peg"), Lit153, "=") != Boolean.FALSE ? runtime.addGlobalVarToCurrentFormEnvironment(Lit4, "jpeg") : Values.empty;
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        Object callComponentMethod;
        runtime.sanitizeComponentData($url);
        Object $responseCode2 = runtime.sanitizeComponentData($responseCode);
        runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = runtime.sanitizeComponentData($responseContent);
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($responseCode2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit158), " is not bound in the current context"), "Unbound Variable") : $responseCode2, Lit159), Lit160, "=") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit7, $responseContent2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit161), " is not bound in the current context"), "Unbound Variable") : $responseContent2);
            runtime.callComponentMethod(Lit0, Lit162, LList.Empty, LList.Empty);
            runtime.callComponentMethod(Lit99, Lit163, LList.Empty, LList.Empty);
            SimpleSymbol simpleSymbol = Lit99;
            SimpleSymbol simpleSymbol2 = Lit164;
            Pair list1 = LList.list1($responseContent2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit161), " is not bound in the current context"), "Unbound Variable") : $responseContent2);
            LList.chain4(list1, "Info", "Ok", "", Boolean.FALSE);
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit165);
            Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit9, runtime.$Stthe$Mnnull$Mnvalue$St));
            callComponentMethod = runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("caripcl"), Lit166, "close screen with value");
        } else {
            callComponentMethod = runtime.callComponentMethod(Lit99, Lit167, LList.list3("Gagal Koneksi, Silahkan Cek Jaringan Anda..... !!!", "Info", "Ok"), Lit168);
        }
        return callComponentMethod;
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        Object obj;
        int i = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (i == 0 ? i == 0 : !this.form$Mnenvironment.isBound(name)) {
            obj = default$Mnvalue;
        } else {
            obj = this.form$Mnenvironment.get(name);
        }
        return obj;
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    @Override // com.google.appinventor.components.runtime.Form, com.google.appinventor.components.runtime.HandlesEventDispatching
    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean z;
        boolean z2;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (isBoundInFormEnvironment(registeredObject)) {
            if (lookupInFormEnvironment(registeredObject) == componentObject) {
                Object handler = lookupHandler(registeredComponentName, eventName);
                try {
                    Scheme.apply.apply2(handler, LList.makeList(args, 0));
                    z2 = true;
                } catch (PermissionException exception) {
                    exception.printStackTrace();
                    boolean x = this == componentObject;
                    if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                        processException(exception);
                    } else {
                        PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                    }
                    z2 = false;
                } catch (Throwable exception2) {
                    androidLogForm(exception2.getMessage());
                    exception2.printStackTrace();
                    processException(exception2);
                    z2 = false;
                }
                z = z2;
            } else {
                z = false;
            }
        } else {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            z = false;
        }
        return z;
    }

    @Override // com.google.appinventor.components.runtime.Form, com.google.appinventor.components.runtime.HandlesEventDispatching
    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        SimpleSymbol handler$Mnsymbol = misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName));
        Object handler = lookupInFormEnvironment(handler$Mnsymbol);
        if (handler != Boolean.FALSE) {
            try {
                Scheme.apply.apply2(handler, lists.cons(componentObject, lists.cons(notAlreadyHandled ? Boolean.TRUE : Boolean.FALSE, LList.makeList(args, 0))));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(componentName == null ? null : componentName.toString(), eventName == null ? null : eventName.toString())));
    }

    @Override // com.google.appinventor.components.runtime.Form
    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        foto = this;
        addToFormEnvironment(Lit0, this);
        LList events = this.events$Mnto$Mnregister;
        Object obj = events;
        while (true) {
            Object obj2 = obj;
            if (obj2 == LList.Empty) {
                break;
            }
            try {
                Pair arg0 = (Pair) obj2;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj3 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj3, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj2);
            }
        }
        try {
            Object components = lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            Object event$Mninfo2 = components;
            while (event$Mninfo2 != LList.Empty) {
                Object obj4 = event$Mninfo2;
                try {
                    Pair arg02 = (Pair) obj4;
                    Object component$Mninfo = arg02.getCar();
                    Object component$Mnname = lists.caddr.apply1(component$Mninfo);
                    lists.cadddr.apply1(component$Mninfo);
                    Object component$Mntype = lists.cadr.apply1(component$Mninfo);
                    Object apply13 = lists.car.apply1(component$Mninfo);
                    try {
                        Object component$Mncontainer = lookupInFormEnvironment((Symbol) apply13);
                        Object component$Mnobject = Invoke.make.apply2(component$Mntype, component$Mncontainer);
                        SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                        try {
                            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                            event$Mninfo2 = arg02.getCdr();
                        } catch (ClassCastException e2) {
                            throw new WrongType(e2, "add-to-form-environment", 0, component$Mnname);
                        }
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "lookup-in-form-environment", 0, apply13);
                    }
                } catch (ClassCastException e4) {
                    throw new WrongType(e4, "arg0", -2, obj4);
                }
            }
            LList var$Mnval$Mnpairs = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            LList lList = var$Mnval$Mnpairs;
            while (lList != LList.Empty) {
                LList lList2 = lList;
                try {
                    Pair arg03 = (Pair) lList2;
                    Object var$Mnval = arg03.getCar();
                    Object var = lists.car.apply1(var$Mnval);
                    Object val$Mnthunk = lists.cadr.apply1(var$Mnval);
                    try {
                        addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(val$Mnthunk));
                        lList = arg03.getCdr();
                    } catch (ClassCastException e5) {
                        throw new WrongType(e5, "add-to-global-var-environment", 0, var);
                    }
                } catch (ClassCastException e6) {
                    throw new WrongType(e6, "arg0", -2, lList2);
                }
            }
            LList var$Mnval$Mnpairs2 = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (var$Mnval$Mnpairs2 != LList.Empty) {
                LList lList3 = var$Mnval$Mnpairs2;
                try {
                    Pair arg04 = (Pair) lList3;
                    misc.force(arg04.getCar());
                    var$Mnval$Mnpairs2 = arg04.getCdr();
                } catch (ClassCastException e7) {
                    throw new WrongType(e7, "arg0", -2, lList3);
                }
            }
            Object obj5 = components;
            while (obj5 != LList.Empty) {
                Object obj6 = obj5;
                try {
                    Pair arg05 = (Pair) obj6;
                    Object component$Mninfo2 = arg05.getCar();
                    lists.caddr.apply1(component$Mninfo2);
                    Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                    if (init$Mnthunk != Boolean.FALSE) {
                        Scheme.applyToArgs.apply1(init$Mnthunk);
                    }
                    obj5 = arg05.getCdr();
                } catch (ClassCastException e8) {
                    throw new WrongType(e8, "arg0", -2, obj6);
                }
            }
            Object obj7 = components;
            while (obj7 != LList.Empty) {
                Object obj8 = obj7;
                try {
                    Pair arg06 = (Pair) obj8;
                    Object component$Mninfo3 = arg06.getCar();
                    Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                    lists.cadddr.apply1(component$Mninfo3);
                    callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                    obj7 = arg06.getCdr();
                } catch (ClassCastException e9) {
                    throw new WrongType(e9, "arg0", -2, obj8);
                }
            }
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = symbols;
        Object obj2 = LList.Empty;
        while (true) {
            Object obj3 = obj2;
            Object obj4 = obj;
            if (obj4 != LList.Empty) {
                try {
                    Pair arg0 = (Pair) obj4;
                    obj = arg0.getCdr();
                    Object car = arg0.getCar();
                    try {
                        obj2 = Pair.make(((Symbol) car).toString(), obj3);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "symbol->string", 1, car);
                    }
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "arg0", -2, obj4);
                }
            } else {
                Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj3));
                try {
                    return misc.string$To$Symbol((CharSequence) apply2);
                } catch (ClassCastException e3) {
                    throw new WrongType(e3, "string->symbol", 1, apply2);
                }
            }
        }
    }

    static Object lambda2() {
        return null;
    }
}
