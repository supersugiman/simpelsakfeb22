package io.kodular.supersugiman.SIMPELSAK22;

import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Decoration;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.MakeroidListViewImageText;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.SpaceView;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.Web;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
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
import kawa.lang.Continuation;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import org.jose4j.jws.AlgorithmIdentifiers;
/* compiled from: caripml.yail */
/* loaded from: classes.dex */
public class caripml extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final PairWithPosition Lit10;
    static final IntNum Lit100;
    static final SimpleSymbol Lit101;
    static final IntNum Lit102;
    static final FString Lit103;
    static final FString Lit104;
    static final SimpleSymbol Lit105;
    static final FString Lit106;
    static final FString Lit107;
    static final IntNum Lit108;
    static final IntNum Lit109;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit110;
    static final SimpleSymbol Lit111;
    static final IntNum Lit112;
    static final SimpleSymbol Lit113;
    static final IntNum Lit114;
    static final IntNum Lit115;
    static final FString Lit116;
    static final FString Lit117;
    static final SimpleSymbol Lit118;
    static final FString Lit119;
    static final SimpleSymbol Lit12;
    static final FString Lit120;
    static final SimpleSymbol Lit121;
    static final FString Lit122;
    static final FString Lit123;
    static final SimpleSymbol Lit124;
    static final IntNum Lit125;
    static final FString Lit126;
    static final FString Lit127;
    static final SimpleSymbol Lit128;
    static final IntNum Lit129;
    static final PairWithPosition Lit13;
    static final FString Lit130;
    static final FString Lit131;
    static final IntNum Lit132;
    static final SimpleSymbol Lit133;
    static final FString Lit134;
    static final SimpleSymbol Lit135;
    static final PairWithPosition Lit136;
    static final IntNum Lit137;
    static final PairWithPosition Lit138;
    static final PairWithPosition Lit139;
    static final PairWithPosition Lit14;
    static final PairWithPosition Lit140;
    static final SimpleSymbol Lit141;
    static final SimpleSymbol Lit142;
    static final PairWithPosition Lit143;
    static final PairWithPosition Lit144;
    static final SimpleSymbol Lit145;
    static final PairWithPosition Lit146;
    static final PairWithPosition Lit147;
    static final SimpleSymbol Lit148;
    static final SimpleSymbol Lit149;
    static final PairWithPosition Lit15;
    static final SimpleSymbol Lit150;
    static final SimpleSymbol Lit151;
    static final PairWithPosition Lit152;
    static final PairWithPosition Lit153;
    static final PairWithPosition Lit154;
    static final PairWithPosition Lit155;
    static final SimpleSymbol Lit156;
    static final SimpleSymbol Lit157;
    static final PairWithPosition Lit158;
    static final PairWithPosition Lit159;
    static final PairWithPosition Lit16;
    static final IntNum Lit160;
    static final PairWithPosition Lit161;
    static final IntNum Lit162;
    static final PairWithPosition Lit163;
    static final PairWithPosition Lit164;
    static final PairWithPosition Lit165;
    static final PairWithPosition Lit166;
    static final PairWithPosition Lit167;
    static final PairWithPosition Lit168;
    static final PairWithPosition Lit169;
    static final PairWithPosition Lit17;
    static final PairWithPosition Lit170;
    static final PairWithPosition Lit171;
    static final PairWithPosition Lit172;
    static final SimpleSymbol Lit173;
    static final SimpleSymbol Lit174;
    static final SimpleSymbol Lit175;
    static final FString Lit176;
    static final SimpleSymbol Lit177;
    static final IntNum Lit178;
    static final FString Lit179;
    static final PairWithPosition Lit18;
    static final FString Lit180;
    static final IntNum Lit181;
    static final FString Lit182;
    static final SimpleSymbol Lit183;
    static final FString Lit184;
    static final IntNum Lit185;
    static final SimpleSymbol Lit186;
    static final SimpleSymbol Lit187;
    static final SimpleSymbol Lit188;
    static final IntNum Lit189;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit190;
    static final SimpleSymbol Lit191;
    static final SimpleSymbol Lit192;
    static final IntNum Lit193;
    static final SimpleSymbol Lit194;
    static final IntNum Lit195;
    static final FString Lit196;
    static final SimpleSymbol Lit197;
    static final SimpleSymbol Lit198;
    static final PairWithPosition Lit199;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit200;
    static final PairWithPosition Lit201;
    static final PairWithPosition Lit202;
    static final SimpleSymbol Lit203;
    static final FString Lit204;
    static final SimpleSymbol Lit205;
    static final IntNum Lit206;
    static final FString Lit207;
    static final FString Lit208;
    static final SimpleSymbol Lit209;
    static final PairWithPosition Lit21;
    static final IntNum Lit210;
    static final FString Lit211;
    static final PairWithPosition Lit212;
    static final SimpleSymbol Lit213;
    static final FString Lit214;
    static final FString Lit215;
    static final SimpleSymbol Lit216;
    static final PairWithPosition Lit217;
    static final PairWithPosition Lit218;
    static final PairWithPosition Lit219;
    static final PairWithPosition Lit22;
    static final PairWithPosition Lit220;
    static final PairWithPosition Lit221;
    static final PairWithPosition Lit222;
    static final PairWithPosition Lit223;
    static final PairWithPosition Lit224;
    static final PairWithPosition Lit225;
    static final PairWithPosition Lit226;
    static final PairWithPosition Lit227;
    static final PairWithPosition Lit23;
    static final PairWithPosition Lit24;
    static final PairWithPosition Lit25;
    static final PairWithPosition Lit26;
    static final PairWithPosition Lit27;
    static final PairWithPosition Lit28;
    static final PairWithPosition Lit29;
    static final SimpleSymbol Lit3;
    static final PairWithPosition Lit30;
    static final PairWithPosition Lit31;
    static final PairWithPosition Lit32;
    static final PairWithPosition Lit33;
    static final PairWithPosition Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40;
    static final SimpleSymbol Lit41;
    static final SimpleSymbol Lit42;
    static final SimpleSymbol Lit43;
    static final SimpleSymbol Lit44;
    static final SimpleSymbol Lit45;
    static final IntNum Lit46;
    static final IntNum Lit47;
    static final PairWithPosition Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final IntNum Lit51;
    static final IntNum Lit52;
    static final PairWithPosition Lit53;
    static final SimpleSymbol Lit54;
    static final PairWithPosition Lit55;
    static final SimpleSymbol Lit56;
    static final SimpleSymbol Lit57;
    static final SimpleSymbol Lit58;
    static final SimpleSymbol Lit59;
    static final SimpleSymbol Lit6;
    static final FString Lit60;
    static final SimpleSymbol Lit61;
    static final SimpleSymbol Lit62;
    static final IntNum Lit63;
    static final SimpleSymbol Lit64;
    static final SimpleSymbol Lit65;
    static final SimpleSymbol Lit66;
    static final IntNum Lit67;
    static final FString Lit68;
    static final FString Lit69;
    static final PairWithPosition Lit7;
    static final SimpleSymbol Lit70;
    static final SimpleSymbol Lit71;
    static final IntNum Lit72;
    static final FString Lit73;
    static final FString Lit74;
    static final SimpleSymbol Lit75;
    static final IntNum Lit76;
    static final FString Lit77;
    static final FString Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final IntNum Lit80;
    static final FString Lit81;
    static final FString Lit82;
    static final SimpleSymbol Lit83;
    static final SimpleSymbol Lit84;
    static final SimpleSymbol Lit85;
    static final IntNum Lit86;
    static final SimpleSymbol Lit87;
    static final SimpleSymbol Lit88;
    static final IntNum Lit89;
    static final SimpleSymbol Lit9;
    static final SimpleSymbol Lit90;
    static final IntNum Lit91;
    static final FString Lit92;
    static final FString Lit93;
    static final SimpleSymbol Lit94;
    static final IntNum Lit95;
    static final FString Lit96;
    static final FString Lit97;
    static final SimpleSymbol Lit98;
    static final SimpleSymbol Lit99;
    public static caripml caripml;
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
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn49 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn51 = null;
    static final ModuleMethod lambda$Fn52 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    static final ModuleMethod proc$Fn50 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button ButtonHome;
    public final ModuleMethod ButtonHome$Click;
    public Button Button_cari;
    public final ModuleMethod Button_cari$Click;
    public Button Button_refresh;
    public final ModuleMethod Button_refresh$Click;
    public Decoration Decoration1;
    public Decoration Decoration2;
    public HorizontalArrangement Horizontal_Arrangement1;
    public HorizontalArrangement Horizontal_Arrangement2;
    public HorizontalArrangement Horizontal_Arrangement3;
    public HorizontalArrangement Horizontal_Arrangement4;
    public Label Label1;
    public MakeroidListViewImageText List_View_Image_and_Text1;
    public final ModuleMethod List_View_Image_and_Text1$Click;
    public Notifier Notifier1;
    public SpaceView Space1;
    public SpaceView Space2;
    public SpaceView Space3;
    public SpaceView Space4;
    public SpaceView Space5;
    public SpaceView Space6;
    public SpaceView Space7;
    public SpaceView Space8;
    public TextBox Text_Box_cari;
    public VerticalArrangement Vertical_Arrangement1;
    public Web Web_cacah;
    public final ModuleMethod Web_cacah$GotText;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public final ModuleMethod caripml$Initialize;
    public final ModuleMethod caripml$OtherScreenClosed;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    static final SimpleSymbol Lit255 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
    static final SimpleSymbol Lit254 = (SimpleSymbol) new SimpleSymbol("list").readResolve();
    static final SimpleSymbol Lit253 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
    static final SimpleSymbol Lit252 = (SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve();
    static final SimpleSymbol Lit251 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
    static final SimpleSymbol Lit250 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
    static final SimpleSymbol Lit249 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    static final SimpleSymbol Lit248 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
    static final SimpleSymbol Lit247 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
    static final SimpleSymbol Lit246 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
    static final SimpleSymbol Lit245 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
    static final SimpleSymbol Lit244 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
    static final SimpleSymbol Lit243 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
    static final SimpleSymbol Lit242 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
    static final SimpleSymbol Lit241 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
    static final SimpleSymbol Lit240 = (SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve();
    static final FString Lit239 = new FString("com.google.appinventor.components.runtime.Decoration");
    static final SimpleSymbol Lit238 = (SimpleSymbol) new SimpleSymbol("Decoration2").readResolve();
    static final FString Lit237 = new FString("com.google.appinventor.components.runtime.Decoration");
    static final FString Lit236 = new FString("com.google.appinventor.components.runtime.Decoration");
    static final FString Lit235 = new FString("com.google.appinventor.components.runtime.Decoration");
    static final FString Lit234 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final IntNum Lit233 = IntNum.make(0);
    static final SimpleSymbol Lit232 = (SimpleSymbol) new SimpleSymbol("NotifierLength").readResolve();
    static final IntNum Lit231 = IntNum.make(new int[]{-18082033});
    static final FString Lit230 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit229 = (SimpleSymbol) new SimpleSymbol("GotText").readResolve();
    static final SimpleSymbol Lit228 = (SimpleSymbol) new SimpleSymbol("Web_cacah$GotText").readResolve();

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit8 = simpleSymbol;
        Lit227 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050585), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050580), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050574);
        Lit226 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050557), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050552), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050547), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050542), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050537), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050532), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050527), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050522), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050517), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050512), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050507), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050502), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050496);
        SimpleSymbol simpleSymbol2 = Lit254;
        SimpleSymbol simpleSymbol3 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit64 = simpleSymbol3;
        Lit225 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050465), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050459);
        Lit224 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050323), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050317);
        Lit223 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050182), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050176);
        Lit222 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050041), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1050035);
        Lit221 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1049895), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1049889);
        Lit220 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1049713), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1049707);
        Lit219 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1049510), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1049504);
        Lit218 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit255, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1049267), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1049261);
        Lit217 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1049104), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1049098);
        Lit216 = (SimpleSymbol) new SimpleSymbol("$responseContent").readResolve();
        Lit215 = new FString("com.google.appinventor.components.runtime.Web");
        Lit214 = new FString("com.google.appinventor.components.runtime.Web");
        Lit213 = (SimpleSymbol) new SimpleSymbol("ButtonHome$Click").readResolve();
        Lit212 = PairWithPosition.make(Lit255, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 1011794);
        Lit211 = new FString("com.google.appinventor.components.runtime.Button");
        Lit210 = IntNum.make(new int[]{-32892943});
        Lit209 = (SimpleSymbol) new SimpleSymbol("ButtonHome").readResolve();
        Lit208 = new FString("com.google.appinventor.components.runtime.Button");
        Lit207 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit206 = IntNum.make(-1005);
        Lit205 = (SimpleSymbol) new SimpleSymbol("Space4").readResolve();
        Lit204 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit203 = (SimpleSymbol) new SimpleSymbol("List_View_Image_and_Text1$Click").readResolve();
        Lit202 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit255, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 922135), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 922129);
        Lit201 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 922112), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 922107), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 922101);
        Lit200 = (SimpleSymbol) new SimpleSymbol("$title").readResolve();
        Lit199 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 922043), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 922037);
        Lit198 = (SimpleSymbol) new SimpleSymbol("$subtitle_data").readResolve();
        Lit197 = (SimpleSymbol) new SimpleSymbol("$subtitle").readResolve();
        Lit196 = new FString("com.google.appinventor.components.runtime.MakeroidListViewImageText");
        Lit195 = IntNum.make(22);
        Lit194 = (SimpleSymbol) new SimpleSymbol("TitleTextSize").readResolve();
        Lit193 = IntNum.make(new int[]{-17625797});
        Lit192 = (SimpleSymbol) new SimpleSymbol("TitleColor").readResolve();
        Lit191 = (SimpleSymbol) new SimpleSymbol("TitleBold").readResolve();
        Lit190 = (SimpleSymbol) new SimpleSymbol("SubtitleTextSize").readResolve();
        Lit189 = IntNum.make(new int[]{-17625797});
        Lit188 = (SimpleSymbol) new SimpleSymbol("SubtitleColor").readResolve();
        Lit187 = (SimpleSymbol) new SimpleSymbol("SubtitleBold").readResolve();
        Lit186 = (SimpleSymbol) new SimpleSymbol("ItemSize").readResolve();
        Lit185 = IntNum.make(new int[]{-1});
        Lit184 = new FString("com.google.appinventor.components.runtime.MakeroidListViewImageText");
        Lit183 = (SimpleSymbol) new SimpleSymbol("Button_refresh$Click").readResolve();
        Lit182 = new FString("com.google.appinventor.components.runtime.Button");
        Lit181 = IntNum.make(new int[]{Component.COLOR_TEAL});
        Lit180 = new FString("com.google.appinventor.components.runtime.Button");
        Lit179 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit178 = IntNum.make(-1005);
        Lit177 = (SimpleSymbol) new SimpleSymbol("Space7").readResolve();
        Lit176 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit175 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit174 = (SimpleSymbol) new SimpleSymbol("Button_cari$Click").readResolve();
        Lit173 = (SimpleSymbol) new SimpleSymbol("proc").readResolve();
        Lit172 = PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 732422);
        Lit171 = PairWithPosition.make(Lit255, PairWithPosition.make(Lit255, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 732310), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 732305);
        Lit170 = PairWithPosition.make(Lit254, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 732278);
        Lit169 = PairWithPosition.make(Lit255, PairWithPosition.make(Lit254, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 732177), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 732172);
        Lit168 = PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731980);
        Lit167 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731887), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731882), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731876);
        Lit166 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731859), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731854), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731849), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731844), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731839), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731834), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731829), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731824), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731819), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731814), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731809), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731804), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731798);
        Lit165 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731767), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731761);
        Lit164 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731625), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731619);
        Lit163 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731484), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731478);
        Lit162 = IntNum.make(6);
        Lit161 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731343), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731337);
        Lit160 = IntNum.make(4);
        Lit159 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731197), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731191);
        Lit158 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731015), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 731009);
        Lit157 = (SimpleSymbol) new SimpleSymbol("$split_item").readResolve();
        Lit156 = (SimpleSymbol) new SimpleSymbol("AddItem").readResolve();
        Lit155 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 730812), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 730806);
        Lit154 = PairWithPosition.make(Lit254, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 730772), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 730766);
        Lit153 = PairWithPosition.make(Lit255, PairWithPosition.make(Lit254, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 730741), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 730736);
        Lit152 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 730351), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 730345);
        Lit151 = (SimpleSymbol) new SimpleSymbol("$item").readResolve();
        Lit150 = (SimpleSymbol) new SimpleSymbol("Visible").readResolve();
        Lit149 = (SimpleSymbol) new SimpleSymbol("ClearList").readResolve();
        Lit148 = (SimpleSymbol) new SimpleSymbol("List_View_Image_and_Text1").readResolve();
        Lit147 = PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 730022);
        Lit146 = PairWithPosition.make(Lit255, PairWithPosition.make(Lit255, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 729920), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 729915);
        Lit145 = (SimpleSymbol) new SimpleSymbol("$cek").readResolve();
        Lit144 = PairWithPosition.make(Lit254, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 729807);
        Lit143 = PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 729670);
        Lit142 = (SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve();
        Lit141 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit140 = PairWithPosition.make(Lit64, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 729523), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 729515);
        Lit139 = PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 729494);
        Lit138 = PairWithPosition.make(Lit64, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 729345), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 729337);
        Lit137 = IntNum.make(8);
        Lit136 = PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 729316);
        Lit135 = (SimpleSymbol) new SimpleSymbol("HideKeyboard").readResolve();
        Lit134 = new FString("com.google.appinventor.components.runtime.Button");
        Lit133 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit132 = IntNum.make(new int[]{-32892943});
        Lit131 = new FString("com.google.appinventor.components.runtime.Button");
        Lit130 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit129 = IntNum.make(-1010);
        Lit128 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement4").readResolve();
        Lit127 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit126 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit125 = IntNum.make(-1003);
        Lit124 = (SimpleSymbol) new SimpleSymbol("Space8").readResolve();
        Lit123 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit122 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit121 = (SimpleSymbol) new SimpleSymbol("Space6").readResolve();
        Lit120 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit119 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit118 = (SimpleSymbol) new SimpleSymbol("Space5").readResolve();
        Lit117 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit116 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit115 = IntNum.make(new int[]{-18082033});
        Lit114 = IntNum.make(5);
        Lit113 = (SimpleSymbol) new SimpleSymbol("InputType").readResolve();
        Lit112 = IntNum.make(new int[]{-17625797});
        Lit111 = (SimpleSymbol) new SimpleSymbol("HintColor").readResolve();
        Lit110 = (SimpleSymbol) new SimpleSymbol("Hint").readResolve();
        Lit109 = IntNum.make(17);
        Lit108 = IntNum.make(new int[]{-31858149});
        Lit107 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit106 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit105 = (SimpleSymbol) new SimpleSymbol("Space2").readResolve();
        Lit104 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit103 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit102 = IntNum.make(16777215);
        Lit101 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit100 = IntNum.make(2);
        Lit99 = (SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve();
        Lit98 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement2").readResolve();
        Lit97 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit96 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit95 = IntNum.make(-1002);
        Lit94 = (SimpleSymbol) new SimpleSymbol("Space3").readResolve();
        Lit93 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit92 = new FString("com.google.appinventor.components.runtime.Label");
        Lit91 = IntNum.make(new int[]{-17625797});
        Lit90 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit89 = IntNum.make(1);
        Lit88 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit87 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit86 = IntNum.make(20);
        Lit85 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit84 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit83 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit82 = new FString("com.google.appinventor.components.runtime.Label");
        Lit81 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit80 = IntNum.make(-1015);
        Lit79 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement3").readResolve();
        Lit78 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit77 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit76 = IntNum.make(50);
        Lit75 = (SimpleSymbol) new SimpleSymbol("Space1").readResolve();
        Lit74 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit73 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit72 = IntNum.make(3);
        Lit71 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit70 = (SimpleSymbol) new SimpleSymbol("Vertical_Arrangement1").readResolve();
        Lit69 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit68 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit67 = IntNum.make(-2);
        Lit66 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit65 = (SimpleSymbol) new SimpleSymbol("Image").readResolve();
        Lit63 = IntNum.make(75);
        Lit62 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit61 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement1").readResolve();
        Lit60 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit59 = (SimpleSymbol) new SimpleSymbol("OtherScreenClosed").readResolve();
        Lit58 = (SimpleSymbol) new SimpleSymbol("caripml$OtherScreenClosed").readResolve();
        Lit57 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit56 = (SimpleSymbol) new SimpleSymbol("caripml$Initialize").readResolve();
        Lit55 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit64, PairWithPosition.make(Lit64, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98773), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98766), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98759), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98754), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98748);
        Lit54 = (SimpleSymbol) new SimpleSymbol("Button_refresh").readResolve();
        Lit53 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit64, PairWithPosition.make(Lit64, PairWithPosition.make(Lit64, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98624), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98617), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98610), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98605), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98599);
        Lit52 = IntNum.make(100);
        Lit51 = IntNum.make(10);
        Lit50 = (SimpleSymbol) new SimpleSymbol("WithIconFromPicture").readResolve();
        Lit49 = (SimpleSymbol) new SimpleSymbol("Button_cari").readResolve();
        SimpleSymbol simpleSymbol4 = Lit64;
        SimpleSymbol simpleSymbol5 = Lit64;
        SimpleSymbol simpleSymbol6 = (SimpleSymbol) new SimpleSymbol("boolean").readResolve();
        Lit40 = simpleSymbol6;
        Lit48 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("component").readResolve(), PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol6, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98478), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98471), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98464), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 98453);
        Lit47 = IntNum.make((int) Component.COLOR_RED);
        Lit46 = IntNum.make(-16537101);
        Lit45 = (SimpleSymbol) new SimpleSymbol("Text_Box_cari").readResolve();
        Lit44 = (SimpleSymbol) new SimpleSymbol("SetShape").readResolve();
        Lit43 = (SimpleSymbol) new SimpleSymbol("Decoration1").readResolve();
        Lit42 = (SimpleSymbol) new SimpleSymbol("TitleBarSubTitle").readResolve();
        Lit41 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit39 = (SimpleSymbol) new SimpleSymbol("Scrollable").readResolve();
        Lit38 = (SimpleSymbol) new SimpleSymbol("ReceiveSharedText").readResolve();
        Lit37 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit36 = (SimpleSymbol) new SimpleSymbol("AppId").readResolve();
        Lit35 = (SimpleSymbol) new SimpleSymbol("AboutScreenTitle").readResolve();
        Lit34 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45804), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45798);
        Lit33 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45770), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45765), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45759);
        Lit32 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45730), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45725), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45719);
        Lit31 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45690), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45685), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45679);
        Lit30 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45648), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45643), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45637);
        Lit29 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45599), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45594), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45588);
        Lit28 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45550), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45545), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45539);
        Lit27 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45804), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45798);
        Lit26 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45770), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45765), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45759);
        Lit25 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45730), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45725), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45719);
        Lit24 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45690), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45685), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45679);
        Lit23 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45648), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45643), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45637);
        Lit22 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45599), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45594), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45588);
        Lit21 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45550), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45545), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 45539);
        Lit20 = (SimpleSymbol) new SimpleSymbol("$data").readResolve();
        Lit19 = (SimpleSymbol) new SimpleSymbol("p$subtitle_cleaning").readResolve();
        Lit18 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41296), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41290);
        Lit17 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41263), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41258), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41252);
        Lit16 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41220), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41215), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41209);
        Lit15 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41296), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41290);
        Lit14 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41263), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41258), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41252);
        Lit13 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41220), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41215), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 41209);
        Lit12 = (SimpleSymbol) new SimpleSymbol("$respon_konten").readResolve();
        Lit11 = (SimpleSymbol) new SimpleSymbol("p$data_web").readResolve();
        Lit10 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 37124), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 37119), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 37114), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 37109), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 37103);
        Lit9 = (SimpleSymbol) new SimpleSymbol("Get").readResolve();
        Lit7 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 37124), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 37119), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 37114), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 37109), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/caripml.yail", 37103);
        Lit6 = (SimpleSymbol) new SimpleSymbol("Url").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("Web_cacah").readResolve();
        Lit4 = (SimpleSymbol) new SimpleSymbol("p$koneksi").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("g$cari").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("caripml").readResolve();
    }

    public caripml() {
        ModuleInfo.register(this);
        frame frameVar = new frame();
        frameVar.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frameVar, 2, Lit240, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frameVar, 3, Lit241, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frameVar, 4, Lit242, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 5, Lit243, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 7, Lit244, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frameVar, 8, Lit245, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frameVar, 9, Lit246, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frameVar, 10, Lit247, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frameVar, 11, Lit248, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frameVar, 12, Lit249, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frameVar, 13, Lit250, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frameVar, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frameVar, 15, Lit251, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frameVar, 16, Lit252, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frameVar, 17, Lit253, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frameVar, 18, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6458243650290595638.scm:615");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frameVar, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frameVar, 20, null, 0);
        lambda$Fn3 = new ModuleMethod(frameVar, 21, null, 0);
        lambda$Fn5 = new ModuleMethod(frameVar, 22, null, 0);
        lambda$Fn4 = new ModuleMethod(frameVar, 23, null, 0);
        lambda$Fn6 = new ModuleMethod(frameVar, 24, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn8 = new ModuleMethod(frameVar, 25, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn7 = new ModuleMethod(frameVar, 26, null, 0);
        lambda$Fn9 = new ModuleMethod(frameVar, 27, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn11 = new ModuleMethod(frameVar, 28, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn10 = new ModuleMethod(frameVar, 29, null, 0);
        lambda$Fn12 = new ModuleMethod(frameVar, 30, null, 0);
        this.caripml$Initialize = new ModuleMethod(frameVar, 31, Lit56, 0);
        this.caripml$OtherScreenClosed = new ModuleMethod(frameVar, 32, Lit58, 8194);
        lambda$Fn13 = new ModuleMethod(frameVar, 33, null, 0);
        lambda$Fn14 = new ModuleMethod(frameVar, 34, null, 0);
        lambda$Fn15 = new ModuleMethod(frameVar, 35, null, 0);
        lambda$Fn16 = new ModuleMethod(frameVar, 36, null, 0);
        lambda$Fn17 = new ModuleMethod(frameVar, 37, null, 0);
        lambda$Fn18 = new ModuleMethod(frameVar, 38, null, 0);
        lambda$Fn19 = new ModuleMethod(frameVar, 39, null, 0);
        lambda$Fn20 = new ModuleMethod(frameVar, 40, null, 0);
        lambda$Fn21 = new ModuleMethod(frameVar, 41, null, 0);
        lambda$Fn22 = new ModuleMethod(frameVar, 42, null, 0);
        lambda$Fn23 = new ModuleMethod(frameVar, 43, null, 0);
        lambda$Fn24 = new ModuleMethod(frameVar, 44, null, 0);
        lambda$Fn25 = new ModuleMethod(frameVar, 45, null, 0);
        lambda$Fn26 = new ModuleMethod(frameVar, 46, null, 0);
        lambda$Fn27 = new ModuleMethod(frameVar, 47, null, 0);
        lambda$Fn28 = new ModuleMethod(frameVar, 48, null, 0);
        lambda$Fn29 = new ModuleMethod(frameVar, 49, null, 0);
        lambda$Fn30 = new ModuleMethod(frameVar, 50, null, 0);
        lambda$Fn31 = new ModuleMethod(frameVar, 51, null, 0);
        lambda$Fn32 = new ModuleMethod(frameVar, 52, null, 0);
        lambda$Fn33 = new ModuleMethod(frameVar, 53, null, 0);
        lambda$Fn34 = new ModuleMethod(frameVar, 54, null, 0);
        lambda$Fn35 = new ModuleMethod(frameVar, 55, null, 0);
        lambda$Fn36 = new ModuleMethod(frameVar, 56, null, 0);
        this.Button_cari$Click = new ModuleMethod(frameVar, 57, Lit174, 0);
        lambda$Fn38 = new ModuleMethod(frameVar, 58, null, 0);
        lambda$Fn39 = new ModuleMethod(frameVar, 59, null, 0);
        lambda$Fn40 = new ModuleMethod(frameVar, 60, null, 0);
        lambda$Fn41 = new ModuleMethod(frameVar, 61, null, 0);
        this.Button_refresh$Click = new ModuleMethod(frameVar, 62, Lit183, 0);
        lambda$Fn42 = new ModuleMethod(frameVar, 63, null, 0);
        lambda$Fn43 = new ModuleMethod(frameVar, 64, null, 0);
        this.List_View_Image_and_Text1$Click = new ModuleMethod(frameVar, 65, Lit203, 16388);
        lambda$Fn44 = new ModuleMethod(frameVar, 66, null, 0);
        lambda$Fn45 = new ModuleMethod(frameVar, 67, null, 0);
        lambda$Fn46 = new ModuleMethod(frameVar, 68, null, 0);
        lambda$Fn47 = new ModuleMethod(frameVar, 69, null, 0);
        this.ButtonHome$Click = new ModuleMethod(frameVar, 70, Lit213, 0);
        lambda$Fn48 = new ModuleMethod(frameVar, 71, null, 0);
        lambda$Fn49 = new ModuleMethod(frameVar, 72, null, 0);
        proc$Fn50 = new ModuleMethod(frameVar, 73, Lit173, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Web_cacah$GotText = new ModuleMethod(frameVar, 74, Lit228, 16388);
        lambda$Fn51 = new ModuleMethod(frameVar, 75, null, 0);
        lambda$Fn52 = new ModuleMethod(frameVar, 76, null, 0);
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
        caripml = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit4, lambda$Fn3), $result);
        } else {
            addToGlobalVars(Lit4, lambda$Fn4);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit11, lambda$Fn6), $result);
        } else {
            addToGlobalVars(Lit11, lambda$Fn7);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit19, lambda$Fn9), $result);
        } else {
            addToGlobalVars(Lit19, lambda$Fn10);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit35, "SIMPEL SAKERNAS", Lit8);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit36, "5510172111798272", Lit8);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit37, "SIMPEL_SP2020", Lit8);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit38, AlgorithmIdentifiers.NONE, Lit8);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit39, Boolean.TRUE, Lit40);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit41, "SIMPEL SAK FEB 2022 (PML)", Lit8);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit42, "Cari ID NKS", Lit8), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn12));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit56, this.caripml$Initialize);
        } else {
            addToFormEnvironment(Lit56, this.caripml$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "caripml", "Initialize");
        } else {
            addToEvents(Lit0, Lit57);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit58, this.caripml$OtherScreenClosed);
        } else {
            addToFormEnvironment(Lit58, this.caripml$OtherScreenClosed);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "caripml", "OtherScreenClosed");
        } else {
            addToEvents(Lit0, Lit59);
        }
        this.Horizontal_Arrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit60, Lit61, lambda$Fn13), $result);
        } else {
            addToComponents(Lit0, Lit68, Lit61, lambda$Fn14);
        }
        this.Vertical_Arrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit69, Lit70, lambda$Fn15), $result);
        } else {
            addToComponents(Lit0, Lit73, Lit70, lambda$Fn16);
        }
        this.Space1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit74, Lit75, lambda$Fn17), $result);
        } else {
            addToComponents(Lit70, Lit77, Lit75, lambda$Fn18);
        }
        this.Horizontal_Arrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit78, Lit79, lambda$Fn19), $result);
        } else {
            addToComponents(Lit70, Lit81, Lit79, lambda$Fn20);
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit82, Lit83, lambda$Fn21), $result);
        } else {
            addToComponents(Lit70, Lit92, Lit83, lambda$Fn22);
        }
        this.Space3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit93, Lit94, lambda$Fn23), $result);
        } else {
            addToComponents(Lit70, Lit96, Lit94, lambda$Fn24);
        }
        this.Horizontal_Arrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit97, Lit98, lambda$Fn25), $result);
        } else {
            addToComponents(Lit70, Lit103, Lit98, lambda$Fn26);
        }
        this.Space2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit98, Lit104, Lit105, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit98, Lit106, Lit105, Boolean.FALSE);
        }
        this.Text_Box_cari = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit98, Lit107, Lit45, lambda$Fn27), $result);
        } else {
            addToComponents(Lit98, Lit116, Lit45, lambda$Fn28);
        }
        this.Space5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit98, Lit117, Lit118, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit98, Lit119, Lit118, Boolean.FALSE);
        }
        this.Space6 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit98, Lit120, Lit121, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit98, Lit122, Lit121, Boolean.FALSE);
        }
        this.Space8 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit123, Lit124, lambda$Fn29), $result);
        } else {
            addToComponents(Lit70, Lit126, Lit124, lambda$Fn30);
        }
        this.Horizontal_Arrangement4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit127, Lit128, lambda$Fn31), $result);
        } else {
            addToComponents(Lit70, Lit130, Lit128, lambda$Fn32);
        }
        this.Button_cari = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit128, Lit131, Lit49, lambda$Fn33), $result);
        } else {
            addToComponents(Lit128, Lit134, Lit49, lambda$Fn34);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit174, this.Button_cari$Click);
        } else {
            addToFormEnvironment(Lit174, this.Button_cari$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button_cari", "Click");
        } else {
            addToEvents(Lit49, Lit175);
        }
        this.Space7 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit128, Lit176, Lit177, lambda$Fn38), $result);
        } else {
            addToComponents(Lit128, Lit179, Lit177, lambda$Fn39);
        }
        this.Button_refresh = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit128, Lit180, Lit54, lambda$Fn40), $result);
        } else {
            addToComponents(Lit128, Lit182, Lit54, lambda$Fn41);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit183, this.Button_refresh$Click);
        } else {
            addToFormEnvironment(Lit183, this.Button_refresh$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button_refresh", "Click");
        } else {
            addToEvents(Lit54, Lit175);
        }
        this.List_View_Image_and_Text1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit184, Lit148, lambda$Fn42), $result);
        } else {
            addToComponents(Lit70, Lit196, Lit148, lambda$Fn43);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit203, this.List_View_Image_and_Text1$Click);
        } else {
            addToFormEnvironment(Lit203, this.List_View_Image_and_Text1$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "List_View_Image_and_Text1", "Click");
        } else {
            addToEvents(Lit148, Lit175);
        }
        this.Space4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit204, Lit205, lambda$Fn44), $result);
        } else {
            addToComponents(Lit70, Lit207, Lit205, lambda$Fn45);
        }
        this.ButtonHome = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit208, Lit209, lambda$Fn46), $result);
        } else {
            addToComponents(Lit70, Lit211, Lit209, lambda$Fn47);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit213, this.ButtonHome$Click);
        } else {
            addToFormEnvironment(Lit213, this.ButtonHome$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonHome", "Click");
        } else {
            addToEvents(Lit209, Lit175);
        }
        this.Web_cacah = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit214, Lit5, lambda$Fn48), $result);
        } else {
            addToComponents(Lit0, Lit215, Lit5, lambda$Fn49);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit228, this.Web_cacah$GotText);
        } else {
            addToFormEnvironment(Lit228, this.Web_cacah$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web_cacah", "GotText");
        } else {
            addToEvents(Lit5, Lit229);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit230, Lit141, lambda$Fn51), $result);
        } else {
            addToComponents(Lit0, Lit234, Lit141, lambda$Fn52);
        }
        this.Decoration1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit235, Lit43, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit236, Lit43, Boolean.FALSE);
        }
        this.Decoration2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit237, Lit238, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit239, Lit238, Boolean.FALSE);
        }
        runtime.initRuntime();
    }

    /* compiled from: caripml.yail */
    /* loaded from: classes.dex */
    public class frame extends ModuleBody {
        caripml $main;

        @Override // gnu.expr.ModuleBody
        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return caripml.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return caripml.lambda3();
                case 21:
                    return caripml.lambda4();
                case 22:
                    return caripml.lambda6();
                case 23:
                    return caripml.lambda5();
                case 24:
                case 25:
                case 27:
                case 28:
                case 32:
                case 65:
                case 73:
                case 74:
                default:
                    return super.apply0(moduleMethod);
                case 26:
                    return caripml.lambda8();
                case 29:
                    return caripml.lambda11();
                case 30:
                    return caripml.lambda13();
                case 31:
                    return this.$main.caripml$Initialize();
                case 33:
                    return caripml.lambda14();
                case 34:
                    return caripml.lambda15();
                case 35:
                    return caripml.lambda16();
                case 36:
                    return caripml.lambda17();
                case 37:
                    return caripml.lambda18();
                case 38:
                    return caripml.lambda19();
                case 39:
                    return caripml.lambda20();
                case 40:
                    return caripml.lambda21();
                case 41:
                    return caripml.lambda22();
                case 42:
                    return caripml.lambda23();
                case 43:
                    return caripml.lambda24();
                case 44:
                    return caripml.lambda25();
                case 45:
                    return caripml.lambda26();
                case 46:
                    return caripml.lambda27();
                case 47:
                    return caripml.lambda28();
                case 48:
                    return caripml.lambda29();
                case 49:
                    return caripml.lambda30();
                case 50:
                    return caripml.lambda31();
                case 51:
                    return caripml.lambda32();
                case 52:
                    return caripml.lambda33();
                case 53:
                    return caripml.lambda34();
                case 54:
                    return caripml.lambda35();
                case 55:
                    return caripml.lambda36();
                case 56:
                    return caripml.lambda37();
                case 57:
                    return this.$main.Button_cari$Click();
                case 58:
                    return caripml.lambda39();
                case 59:
                    return caripml.lambda40();
                case 60:
                    return caripml.lambda41();
                case 61:
                    return caripml.lambda42();
                case 62:
                    return this.$main.Button_refresh$Click();
                case 63:
                    return caripml.lambda43();
                case 64:
                    return caripml.lambda44();
                case 66:
                    return caripml.lambda45();
                case 67:
                    return caripml.lambda46();
                case 68:
                    return caripml.lambda47();
                case 69:
                    return caripml.lambda48();
                case 70:
                    return this.$main.ButtonHome$Click();
                case 71:
                    return caripml.lambda49();
                case 72:
                    return caripml.lambda50();
                case 75:
                    return caripml.lambda52();
                case 76:
                    return caripml.lambda53();
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 2:
                    return this.$main.getSimpleName(obj);
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
                case 24:
                    return caripml.lambda7(obj);
                case 25:
                    return caripml.lambda9(obj);
                case 27:
                    return caripml.lambda10(obj);
                case 28:
                    return caripml.lambda12(obj);
                case 73:
                    return caripml.lambda51proc(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
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
                case 25:
                case 27:
                case 28:
                case 32:
                case 65:
                case 73:
                case 74:
                default:
                    return super.match0(moduleMethod, callContext);
                case 26:
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
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 64:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 67:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 68:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 69:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 70:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 71:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 72:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 75:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 76:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 2:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 5:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 7:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 14:
                    if (obj instanceof caripml) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 24:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 25:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 27:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 28:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 73:
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
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.value2 = obj2;
                        callContext.proc = moduleMethod;
                        callContext.pc = 2;
                        return 0;
                    }
                    return -786431;
                case 8:
                    if (obj instanceof Symbol) {
                        callContext.value1 = obj;
                        callContext.value2 = obj2;
                        callContext.proc = moduleMethod;
                        callContext.pc = 2;
                        return 0;
                    }
                    return -786431;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 32:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 15:
                    if (obj instanceof caripml) {
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
                case 16:
                    if (obj instanceof caripml) {
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
                case 65:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 74:
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
        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
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
                case 16:
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
                case 65:
                    return this.$main.List_View_Image_and_Text1$Click(obj, obj2, obj3, obj4);
                case 74:
                    return this.$main.Web_cacah$GotText(obj, obj2, obj3, obj4);
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                case 32:
                    return this.$main.caripml$OtherScreenClosed(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }
    }

    static Object lambda3() {
        return runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
    }

    static Object lambda4() {
        SimpleSymbol simpleSymbol = Lit5;
        SimpleSymbol simpleSymbol2 = Lit6;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair list1 = LList.list1("https://spreadsheet.google.com/tq?tqx=out:csv&key=");
        LList.chain4(list1, "16S-sT7ta8KtZF9kAWco3BlEWbf6HaskpZOWOgtO08ps", "&gid=", "0", "&tq=");
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, runtime.callYailPrimitive(moduleMethod, list1, Lit7, "join"), Lit8);
        return runtime.callComponentMethod(Lit5, Lit9, LList.Empty, LList.Empty);
    }

    static Procedure lambda5() {
        return lambda$Fn5;
    }

    static Object lambda6() {
        SimpleSymbol simpleSymbol = Lit5;
        SimpleSymbol simpleSymbol2 = Lit6;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair list1 = LList.list1("https://spreadsheet.google.com/tq?tqx=out:csv&key=");
        LList.chain4(list1, "16S-sT7ta8KtZF9kAWco3BlEWbf6HaskpZOWOgtO08ps", "&gid=", "0", "&tq=");
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, runtime.callYailPrimitive(moduleMethod, list1, Lit10, "join"), Lit8);
        return runtime.callComponentMethod(Lit5, Lit9, LList.Empty, LList.Empty);
    }

    static Object lambda7(Object $respon_konten) {
        return runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3($respon_konten instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit12), " is not bound in the current context"), "Unbound Variable") : $respon_konten, "\"", ""), Lit13, "replace all"), "\n", ";"), Lit14, "replace all"), ";"), Lit15, "split");
    }

    static Procedure lambda8() {
        return lambda$Fn8;
    }

    static Object lambda9(Object $respon_konten) {
        return runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3($respon_konten instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit12), " is not bound in the current context"), "Unbound Variable") : $respon_konten, "\"", ""), Lit16, "replace all"), "\n", ";"), Lit17, "replace all"), ";"), Lit18, "split");
    }

    static Object lambda10(Object $data) {
        return runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3($data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit20), " is not bound in the current context"), "Unbound Variable") : $data, "idsls", ""), Lit21, "replace all"), "Kecamatan", ""), Lit22, "replace all"), "Kelurahan", ""), Lit23, "replace all"), "PS", ""), Lit24, "replace all"), "", ""), Lit25, "replace all"), "", ""), Lit26, "replace all"), "\n"), Lit27, "split");
    }

    static Procedure lambda11() {
        return lambda$Fn11;
    }

    static Object lambda12(Object $data) {
        return runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3($data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit20), " is not bound in the current context"), "Unbound Variable") : $data, "idsls", ""), Lit28, "replace all"), "Kecamatan", ""), Lit29, "replace all"), "Kelurahan", ""), Lit30, "replace all"), "PS", ""), Lit31, "replace all"), "", ""), Lit32, "replace all"), "", ""), Lit33, "replace all"), "\n"), Lit34, "split");
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit35, "SIMPEL SAKERNAS", Lit8);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit36, "5510172111798272", Lit8);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit37, "SIMPEL_SP2020", Lit8);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit38, AlgorithmIdentifiers.NONE, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit39, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit41, "SIMPEL SAK FEB 2022 (PML)", Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit42, "Cari ID NKS", Lit8);
    }

    public Object caripml$Initialize() {
        runtime.setThisForm();
        Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St));
        runtime.callComponentMethod(Lit43, Lit44, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit45), Lit46, Lit47, Boolean.TRUE), Lit48);
        SimpleSymbol simpleSymbol = Lit49;
        SimpleSymbol simpleSymbol2 = Lit50;
        Pair list1 = LList.list1("left");
        LList.chain4(list1, "cari.png", Lit51, Lit52, Lit52);
        runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit53);
        SimpleSymbol simpleSymbol3 = Lit54;
        SimpleSymbol simpleSymbol4 = Lit50;
        Pair list12 = LList.list1("left");
        LList.chain4(list12, "segar.png", Lit51, Lit52, Lit52);
        return runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, list12, Lit55);
    }

    public Object caripml$OtherScreenClosed(Object $otherScreenName, Object $result) {
        runtime.sanitizeComponentData($otherScreenName);
        runtime.sanitizeComponentData($result);
        runtime.setThisForm();
        return Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit61, Lit62, Lit63, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit61, Lit65, "BPS_RIAU.jpg", Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit61, Lit66, Lit67, Lit64);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit61, Lit62, Lit63, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit61, Lit65, "BPS_RIAU.jpg", Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit61, Lit66, Lit67, Lit64);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit70, Lit71, Lit72, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit70, Lit62, Lit67, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit70, Lit66, Lit67, Lit64);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit70, Lit71, Lit72, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit70, Lit62, Lit67, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit70, Lit66, Lit67, Lit64);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit62, Lit76, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit66, Lit67, Lit64);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit62, Lit76, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit66, Lit67, Lit64);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit79, Lit62, Lit80, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit79, Lit65, "ID_NKS.jpg", Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit79, Lit66, Lit67, Lit64);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit79, Lit62, Lit80, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit79, Lit65, "ID_NKS.jpg", Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit79, Lit66, Lit67, Lit64);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit83, Lit84, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit83, Lit85, Lit86, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit83, Lit87, "MASUKAN ID NKS", Lit8);
        runtime.setAndCoerceProperty$Ex(Lit83, Lit88, Lit89, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit83, Lit90, Lit91, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit83, Lit66, Lit67, Lit64);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit83, Lit84, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit83, Lit85, Lit86, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit83, Lit87, "MASUKAN ID NKS", Lit8);
        runtime.setAndCoerceProperty$Ex(Lit83, Lit88, Lit89, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit83, Lit90, Lit91, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit83, Lit66, Lit67, Lit64);
    }

    static Object lambda24() {
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit62, Lit95, Lit64);
    }

    static Object lambda25() {
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit62, Lit95, Lit64);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit98, Lit71, Lit72, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit99, Lit100, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit101, Lit102, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit98, Lit66, Lit67, Lit64);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit98, Lit71, Lit72, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit99, Lit100, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit101, Lit102, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit98, Lit66, Lit67, Lit64);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit101, Lit108, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit84, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit85, Lit109, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit110, "ID NKS", Lit8);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit111, Lit112, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit113, Lit114, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit88, Lit89, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit90, Lit115, Lit64);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit101, Lit108, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit84, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit85, Lit109, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit110, "ID NKS", Lit8);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit111, Lit112, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit113, Lit114, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit88, Lit89, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit90, Lit115, Lit64);
    }

    static Object lambda30() {
        return runtime.setAndCoerceProperty$Ex(Lit124, Lit62, Lit125, Lit64);
    }

    static Object lambda31() {
        return runtime.setAndCoerceProperty$Ex(Lit124, Lit62, Lit125, Lit64);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit128, Lit71, Lit72, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit128, Lit99, Lit100, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit128, Lit62, Lit129, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit128, Lit66, Lit67, Lit64);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit128, Lit71, Lit72, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit128, Lit99, Lit100, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit128, Lit62, Lit129, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit128, Lit66, Lit67, Lit64);
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit101, Lit132, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit84, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit85, Lit109, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit133, Lit89, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit87, "CARI", Lit8);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit101, Lit132, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit84, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit85, Lit109, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit133, Lit89, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit87, "CARI", Lit8);
    }

    /* compiled from: caripml.yail */
    /* loaded from: classes.dex */
    public class frame0 extends ModuleBody {
        Continuation $Styail$Mnbreak$St;
        final ModuleMethod proc$Fn37 = new ModuleMethod(this, 1, caripml.Lit173, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        @Override // gnu.expr.ModuleBody
        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            return moduleMethod.selector == 1 ? lambda38proc(obj) : super.apply1(moduleMethod, obj);
        }

        @Override // gnu.expr.ModuleBody
        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            if (moduleMethod.selector == 1) {
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.pc = 1;
                return 0;
            }
            return super.match1(moduleMethod, obj, callContext);
        }

        public Object lambda38proc(Object $item) {
            Object callComponentMethod;
            if (runtime.callYailPrimitive(runtime.string$Mncontains, LList.list2($item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(caripml.Lit151), " is not bound in the current context"), "Unbound Variable") : $item, runtime.get$Mnproperty.apply2(caripml.Lit45, caripml.Lit87)), caripml.Lit152, "contains") != Boolean.FALSE) {
                runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
                Object $split_item = runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(caripml.Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.callYailPrimitive(runtime.yail$Mnlist$Mnindex, LList.list2($item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(caripml.Lit151), " is not bound in the current context"), "Unbound Variable") : $item, runtime.lookupGlobalVarInCurrentFormEnvironment(caripml.Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), caripml.Lit153, "index in list")), caripml.Lit154, "select list item"), ","), caripml.Lit155, "split");
                SimpleSymbol simpleSymbol = caripml.Lit148;
                SimpleSymbol simpleSymbol2 = caripml.Lit156;
                Object callYailPrimitive = runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(caripml.Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, caripml.Lit100), caripml.Lit158, "select list item");
                ModuleMethod moduleMethod = strings.string$Mnappend;
                Pair list1 = LList.list1(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(caripml.Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, caripml.Lit89), caripml.Lit159, "select list item"));
                LList.chain4(LList.chain4(LList.chain4(list1, "\n", "Kab/Kota :  ", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(caripml.Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, caripml.Lit160), caripml.Lit161, "select list item"), "\n"), "Kec :  ", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(caripml.Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, caripml.Lit162), caripml.Lit163, "select list item"), "\n", "Kel :  "), runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(caripml.Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, caripml.Lit137), caripml.Lit164, "select list item"), "\n", "NBS :  ", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(caripml.Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, caripml.Lit51), caripml.Lit165, "select list item"));
                runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list3("dp2.png", callYailPrimitive, runtime.callYailPrimitive(moduleMethod, list1, caripml.Lit166, "join")), caripml.Lit167);
                runtime.callComponentMethod(caripml.Lit141, caripml.Lit142, LList.list1("ID NKS di temukan"), caripml.Lit168);
                callComponentMethod = this.$Styail$Mnbreak$St.apply1(Boolean.FALSE);
            } else {
                callComponentMethod = runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnindex, LList.list2($item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(caripml.Lit151), " is not bound in the current context"), "Unbound Variable") : $item, runtime.lookupGlobalVarInCurrentFormEnvironment(caripml.Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), caripml.Lit169, "index in list"), runtime.callYailPrimitive(runtime.yail$Mnlist$Mnlength, LList.list1(runtime.lookupGlobalVarInCurrentFormEnvironment(caripml.Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), caripml.Lit170, "length of list")), caripml.Lit171, "=") != Boolean.FALSE ? runtime.callComponentMethod(caripml.Lit141, caripml.Lit142, LList.list1("ID NKS  tidak ditemukan"), caripml.Lit172) : Values.empty;
            }
            return callComponentMethod;
        }
    }

    public Object Button_cari$Click() {
        Object handleException;
        Object obj;
        runtime.setThisForm();
        runtime.callComponentMethod(Lit0, Lit135, LList.Empty, LList.Empty);
        if (runtime.processOrDelayed$V(new Object[]{lambda$Fn35, lambda$Fn36}) != Boolean.FALSE) {
            obj = runtime.callComponentMethod(Lit141, Lit142, LList.list1("ID NKS tidak boleh kosong dan harus berisi 8 digit !!!"), Lit143);
        } else {
            Boolean bool = Boolean.FALSE;
            Object $cek = runtime.callYailPrimitive(runtime.yail$Mnlist$Mnempty$Qu, LList.list1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit144, "is list empty?");
            if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($cek instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit145), " is not bound in the current context"), "Unbound Variable") : $cek, Boolean.TRUE), Lit146, "=") != Boolean.FALSE) {
                obj = runtime.callComponentMethod(Lit141, Lit142, LList.list1("ID NKS  salah"), Lit147);
            } else {
                runtime.callComponentMethod(Lit148, Lit149, LList.Empty, LList.Empty);
                runtime.setAndCoerceProperty$Ex(Lit148, Lit150, Boolean.TRUE, Lit40);
                Continuation $StYailBreak$St = new Continuation(CallContext.getInstance());
                try {
                    frame0 frame0Var = new frame0();
                    frame0Var.$Styail$Mnbreak$St = $StYailBreak$St;
                    ModuleMethod moduleMethod = frame0Var.proc$Fn37;
                    Object yailForEach = runtime.yailForEach(frame0Var.proc$Fn37, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
                    $StYailBreak$St.invoked = true;
                    handleException = yailForEach;
                } catch (Throwable th) {
                    handleException = Continuation.handleException(th, $StYailBreak$St);
                }
                obj = handleException;
            }
        }
        return obj;
    }

    static Object lambda36() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.callYailPrimitive(strings.string$Mnlength, LList.list1(runtime.get$Mnproperty.apply2(Lit45, Lit87)), Lit136, "length"), Lit137), Lit138, "<");
    }

    static Object lambda37() {
        return runtime.callYailPrimitive(Scheme.numGrt, LList.list2(runtime.callYailPrimitive(strings.string$Mnlength, LList.list1(runtime.get$Mnproperty.apply2(Lit45, Lit87)), Lit139, "length"), Lit137), Lit140, ">");
    }

    static Object lambda39() {
        return runtime.setAndCoerceProperty$Ex(Lit177, Lit66, Lit178, Lit64);
    }

    static Object lambda40() {
        return runtime.setAndCoerceProperty$Ex(Lit177, Lit66, Lit178, Lit64);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit101, Lit181, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit84, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit85, Lit109, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit133, Lit89, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit87, "REFRESH", Lit8);
    }

    static Object lambda42() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit101, Lit181, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit84, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit85, Lit109, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit133, Lit89, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit87, "REFRESH", Lit8);
    }

    public Object Button_refresh$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit0, Lit135, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit87, "", Lit8);
        return Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    static Object lambda43() {
        runtime.setAndCoerceProperty$Ex(Lit148, Lit101, Lit185, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit186, Lit72, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit187, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit188, Lit189, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit190, Lit86, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit191, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit192, Lit193, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit148, Lit194, Lit195, Lit64);
    }

    static Object lambda44() {
        runtime.setAndCoerceProperty$Ex(Lit148, Lit101, Lit185, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit186, Lit72, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit187, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit188, Lit189, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit190, Lit86, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit191, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit192, Lit193, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit148, Lit194, Lit195, Lit64);
    }

    public Object List_View_Image_and_Text1$Click(Object $position, Object $title, Object $subtitle, Object $image) {
        runtime.sanitizeComponentData($position);
        Object $title2 = runtime.sanitizeComponentData($title);
        Object $subtitle2 = runtime.sanitizeComponentData($subtitle);
        runtime.sanitizeComponentData($image);
        runtime.setThisForm();
        runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        Object $subtitle_data = Scheme.applyToArgs.apply2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit19, runtime.$Stthe$Mnnull$Mnvalue$St), $subtitle2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit197), " is not bound in the current context"), "Unbound Variable") : $subtitle2);
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("entrypml", runtime.callYailPrimitive(strings.string$Mnappend, LList.list3(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($subtitle_data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit198), " is not bound in the current context"), "Unbound Variable") : $subtitle_data, Lit89), Lit199, "select list item"), ",", $title2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit200), " is not bound in the current context"), "Unbound Variable") : $title2), Lit201, "join")), Lit202, "open another screen with start value");
    }

    static Object lambda45() {
        return runtime.setAndCoerceProperty$Ex(Lit205, Lit62, Lit206, Lit64);
    }

    static Object lambda46() {
        return runtime.setAndCoerceProperty$Ex(Lit205, Lit62, Lit206, Lit64);
    }

    static Object lambda47() {
        runtime.setAndCoerceProperty$Ex(Lit209, Lit101, Lit210, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit209, Lit84, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit209, Lit85, Lit109, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit209, Lit87, "HOME", Lit8);
    }

    static Object lambda48() {
        runtime.setAndCoerceProperty$Ex(Lit209, Lit101, Lit210, Lit64);
        runtime.setAndCoerceProperty$Ex(Lit209, Lit84, Boolean.TRUE, Lit40);
        runtime.setAndCoerceProperty$Ex(Lit209, Lit85, Lit109, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit209, Lit87, "HOME", Lit8);
    }

    public Object ButtonHome$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnscreen$Mnwith$Mnvalue, LList.list1("Screen1"), Lit212, "close screen with value");
    }

    static Object lambda49() {
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit6, "https://docs.google.com/spreadsheets/d/16S-sT7ta8KtZF9kAWco3BlEWbf6HaskpZOWOgtO08ps/edit#gid=1545515893", Lit8);
    }

    static Object lambda50() {
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit6, "https://docs.google.com/spreadsheets/d/16S-sT7ta8KtZF9kAWco3BlEWbf6HaskpZOWOgtO08ps/edit#gid=1545515893", Lit8);
    }

    public Object Web_cacah$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        runtime.sanitizeComponentData($url);
        runtime.sanitizeComponentData($responseCode);
        runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = runtime.sanitizeComponentData($responseContent);
        runtime.setThisForm();
        runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list"));
        runtime.callComponentMethod(Lit148, Lit149, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit148, Lit150, Boolean.FALSE, Lit40);
        runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        Object $data = Scheme.applyToArgs.apply2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit11, runtime.$Stthe$Mnnull$Mnvalue$St), $responseContent2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit216), " is not bound in the current context"), "Unbound Variable") : $responseContent2);
        runtime.callYailPrimitive(runtime.yail$Mnlist$Mnremove$Mnitem$Ex, LList.list2($data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit20), " is not bound in the current context"), "Unbound Variable") : $data, Lit89), Lit217, "remove list item");
        ModuleMethod moduleMethod = proc$Fn50;
        return runtime.yailForEach(proc$Fn50, $data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit20), " is not bound in the current context"), "Unbound Variable") : $data);
    }

    public static Object lambda51proc(Object $item) {
        runtime.callYailPrimitive(runtime.yail$Mnlist$Mnadd$Mnto$Mnlist$Ex, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), $item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit151), " is not bound in the current context"), "Unbound Variable") : $item), Lit218, "add items to list");
        runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        Object $split_item = runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2($item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit151), " is not bound in the current context"), "Unbound Variable") : $item, ","), Lit219, "split");
        SimpleSymbol simpleSymbol = Lit148;
        SimpleSymbol simpleSymbol2 = Lit156;
        Object callYailPrimitive = runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, Lit100), Lit220, "select list item");
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair list1 = LList.list1(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, Lit89), Lit221, "select list item"));
        LList.chain4(LList.chain4(LList.chain4(list1, "\n", "Kab/Kota :  ", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, Lit160), Lit222, "select list item"), "\n"), "Kec :  ", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, Lit162), Lit223, "select list item"), "\n", "Kel :  "), runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, Lit137), Lit224, "select list item"), "\n", "NBS :  ", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($split_item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit157), " is not bound in the current context"), "Unbound Variable") : $split_item, Lit51), Lit225, "select list item"));
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list3("dp2.png", callYailPrimitive, runtime.callYailPrimitive(moduleMethod, list1, Lit226, "join")), Lit227);
    }

    static Object lambda52() {
        runtime.setAndCoerceProperty$Ex(Lit141, Lit101, Lit231, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit141, Lit232, Lit233, Lit64);
    }

    static Object lambda53() {
        runtime.setAndCoerceProperty$Ex(Lit141, Lit101, Lit231, Lit64);
        return runtime.setAndCoerceProperty$Ex(Lit141, Lit232, Lit233, Lit64);
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
        caripml = this;
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
