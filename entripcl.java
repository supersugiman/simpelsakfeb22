package io.kodular.supersugiman.SIMPELSAK22;

import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.DatePicker;
import com.google.appinventor.components.runtime.Decoration;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.GoogleMap;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.LocationSensor;
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
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.DivideOp;
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
/* compiled from: entrypcl.yail */
/* loaded from: classes.dex */
public class entrypcl extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final PairWithPosition Lit10;
    static final SimpleSymbol Lit100;
    static final SimpleSymbol Lit101;
    static final IntNum Lit102;
    static final FString Lit103;
    static final FString Lit104;
    static final SimpleSymbol Lit105;
    static final IntNum Lit106;
    static final SimpleSymbol Lit107;
    static final SimpleSymbol Lit108;
    static final IntNum Lit109;
    static final PairWithPosition Lit11;
    static final IntNum Lit110;
    static final FString Lit111;
    static final FString Lit112;
    static final IntNum Lit113;
    static final FString Lit114;
    static final FString Lit115;
    static final IntNum Lit116;
    static final FString Lit117;
    static final FString Lit118;
    static final SimpleSymbol Lit119;
    static final PairWithPosition Lit12;
    static final SimpleSymbol Lit120;
    static final IntNum Lit121;
    static final FString Lit122;
    static final FString Lit123;
    static final SimpleSymbol Lit124;
    static final FString Lit125;
    static final FString Lit126;
    static final SimpleSymbol Lit127;
    static final IntNum Lit128;
    static final SimpleSymbol Lit129;
    static final PairWithPosition Lit13;
    static final SimpleSymbol Lit130;
    static final FString Lit131;
    static final SimpleSymbol Lit132;
    static final SimpleSymbol Lit133;
    static final SimpleSymbol Lit134;
    static final SimpleSymbol Lit135;
    static final FString Lit136;
    static final SimpleSymbol Lit137;
    static final IntNum Lit138;
    static final IntNum Lit139;
    static final PairWithPosition Lit14;
    static final FString Lit140;
    static final FString Lit141;
    static final SimpleSymbol Lit142;
    static final IntNum Lit143;
    static final IntNum Lit144;
    static final FString Lit145;
    static final FString Lit146;
    static final SimpleSymbol Lit147;
    static final IntNum Lit148;
    static final FString Lit149;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit150;
    static final SimpleSymbol Lit151;
    static final SimpleSymbol Lit152;
    static final PairWithPosition Lit153;
    static final SimpleSymbol Lit154;
    static final SimpleSymbol Lit155;
    static final FString Lit156;
    static final IntNum Lit157;
    static final FString Lit158;
    static final FString Lit159;
    static final SimpleSymbol Lit16;
    static final SimpleSymbol Lit160;
    static final IntNum Lit161;
    static final FString Lit162;
    static final FString Lit163;
    static final SimpleSymbol Lit164;
    static final IntNum Lit165;
    static final FString Lit166;
    static final SimpleSymbol Lit167;
    static final FString Lit168;
    static final IntNum Lit169;
    static final PairWithPosition Lit17;
    static final FString Lit170;
    static final FString Lit171;
    static final SimpleSymbol Lit172;
    static final IntNum Lit173;
    static final FString Lit174;
    static final FString Lit175;
    static final SimpleSymbol Lit176;
    static final IntNum Lit177;
    static final FString Lit178;
    static final FString Lit179;
    static final PairWithPosition Lit18;
    static final IntNum Lit180;
    static final FString Lit181;
    static final FString Lit182;
    static final SimpleSymbol Lit183;
    static final FString Lit184;
    static final FString Lit185;
    static final FString Lit186;
    static final FString Lit187;
    static final SimpleSymbol Lit188;
    static final FString Lit189;
    static final SimpleSymbol Lit19;
    static final FString Lit190;
    static final SimpleSymbol Lit191;
    static final FString Lit192;
    static final FString Lit193;
    static final IntNum Lit194;
    static final FString Lit195;
    static final SimpleSymbol Lit196;
    static final SimpleSymbol Lit197;
    static final FString Lit198;
    static final SimpleSymbol Lit199;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final IntNum Lit200;
    static final FString Lit201;
    static final FString Lit202;
    static final IntNum Lit203;
    static final FString Lit204;
    static final PairWithPosition Lit205;
    static final SimpleSymbol Lit206;
    static final SimpleSymbol Lit207;
    static final PairWithPosition Lit208;
    static final SimpleSymbol Lit209;
    static final SimpleSymbol Lit21;
    static final PairWithPosition Lit210;
    static final IntNum Lit211;
    static final PairWithPosition Lit212;
    static final PairWithPosition Lit213;
    static final PairWithPosition Lit214;
    static final PairWithPosition Lit215;
    static final PairWithPosition Lit216;
    static final PairWithPosition Lit217;
    static final PairWithPosition Lit218;
    static final PairWithPosition Lit219;
    static final SimpleSymbol Lit22;
    static final PairWithPosition Lit220;
    static final PairWithPosition Lit221;
    static final PairWithPosition Lit222;
    static final PairWithPosition Lit223;
    static final PairWithPosition Lit224;
    static final SimpleSymbol Lit225;
    static final PairWithPosition Lit226;
    static final SimpleSymbol Lit227;
    static final SimpleSymbol Lit228;
    static final SimpleSymbol Lit229;
    static final SimpleSymbol Lit23;
    static final PairWithPosition Lit230;
    static final PairWithPosition Lit231;
    static final PairWithPosition Lit232;
    static final PairWithPosition Lit233;
    static final SimpleSymbol Lit234;
    static final FString Lit235;
    static final SimpleSymbol Lit236;
    static final IntNum Lit237;
    static final FString Lit238;
    static final FString Lit239;
    static final SimpleSymbol Lit24;
    static final SimpleSymbol Lit240;
    static final IntNum Lit241;
    static final FString Lit242;
    static final FString Lit243;
    static final SimpleSymbol Lit244;
    static final FString Lit245;
    static final SimpleSymbol Lit246;
    static final SimpleSymbol Lit247;
    static final PairWithPosition Lit248;
    static final SimpleSymbol Lit249;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit250;
    static final SimpleSymbol Lit251;
    static final SimpleSymbol Lit252;
    static final IntNum Lit253;
    static final PairWithPosition Lit254;
    static final SimpleSymbol Lit255;
    static final PairWithPosition Lit256;
    static final PairWithPosition Lit257;
    static final SimpleSymbol Lit258;
    static final SimpleSymbol Lit259;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit260;
    static final FString Lit261;
    static final SimpleSymbol Lit262;
    static final FString Lit263;
    static final FString Lit264;
    static final IntNum Lit265;
    static final FString Lit266;
    static final FString Lit267;
    static final FString Lit268;
    static final SimpleSymbol Lit269;
    static final SimpleSymbol Lit27;
    static final PairWithPosition Lit270;
    static final SimpleSymbol Lit271;
    static final SimpleSymbol Lit272;
    static final PairWithPosition Lit273;
    static final SimpleSymbol Lit274;
    static final PairWithPosition Lit275;
    static final IntNum Lit276;
    static final PairWithPosition Lit277;
    static final SimpleSymbol Lit278;
    static final PairWithPosition Lit279;
    static final SimpleSymbol Lit28;
    static final PairWithPosition Lit280;
    static final PairWithPosition Lit281;
    static final SimpleSymbol Lit282;
    static final SimpleSymbol Lit283;
    static final FString Lit284;
    static final FString Lit285;
    static final FString Lit286;
    static final FString Lit287;
    static final SimpleSymbol Lit288;
    static final IntNum Lit289;
    static final SimpleSymbol Lit29;
    static final PairWithPosition Lit290;
    static final SimpleSymbol Lit291;
    static final SimpleSymbol Lit292;
    static final SimpleSymbol Lit293;
    static final PairWithPosition Lit294;
    static final PairWithPosition Lit295;
    static final PairWithPosition Lit296;
    static final SimpleSymbol Lit297;
    static final PairWithPosition Lit298;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final SimpleSymbol Lit33;
    static final PairWithPosition Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final IntNum Lit38;
    static final IntNum Lit39;
    static final IntNum Lit4;
    static final PairWithPosition Lit40;
    static final SimpleSymbol Lit41;
    static final IntNum Lit42;
    static final PairWithPosition Lit43;
    static final SimpleSymbol Lit44;
    static final IntNum Lit45;
    static final PairWithPosition Lit46;
    static final SimpleSymbol Lit47;
    static final IntNum Lit48;
    static final PairWithPosition Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final IntNum Lit51;
    static final PairWithPosition Lit52;
    static final SimpleSymbol Lit53;
    static final IntNum Lit54;
    static final PairWithPosition Lit55;
    static final SimpleSymbol Lit56;
    static final IntNum Lit57;
    static final PairWithPosition Lit58;
    static final SimpleSymbol Lit59;
    static final SimpleSymbol Lit6;
    static final IntNum Lit60;
    static final PairWithPosition Lit61;
    static final SimpleSymbol Lit62;
    static final IntNum Lit63;
    static final IntNum Lit64;
    static final PairWithPosition Lit65;
    static final SimpleSymbol Lit66;
    static final IntNum Lit67;
    static final IntNum Lit68;
    static final PairWithPosition Lit69;
    static final SimpleSymbol Lit7;
    static final PairWithPosition Lit70;
    static final SimpleSymbol Lit71;
    static final PairWithPosition Lit72;
    static final SimpleSymbol Lit73;
    static final SimpleSymbol Lit74;
    static final SimpleSymbol Lit75;
    static final SimpleSymbol Lit76;
    static final PairWithPosition Lit77;
    static final SimpleSymbol Lit78;
    static final SimpleSymbol Lit79;
    static final PairWithPosition Lit8;
    static final FString Lit80;
    static final SimpleSymbol Lit81;
    static final FString Lit82;
    static final FString Lit83;
    static final SimpleSymbol Lit84;
    static final SimpleSymbol Lit85;
    static final IntNum Lit86;
    static final SimpleSymbol Lit87;
    static final SimpleSymbol Lit88;
    static final IntNum Lit89;
    static final IntNum Lit9;
    static final SimpleSymbol Lit90;
    static final IntNum Lit91;
    static final SimpleSymbol Lit92;
    static final IntNum Lit93;
    static final SimpleSymbol Lit94;
    static final IntNum Lit95;
    static final FString Lit96;
    static final FString Lit97;
    static final SimpleSymbol Lit98;
    static final SimpleSymbol Lit99;
    public static entrypcl entrypcl;
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
    static final ModuleMethod lambda$Fn37 = null;
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
    static final ModuleMethod lambda$Fn50 = null;
    static final ModuleMethod lambda$Fn51 = null;
    static final ModuleMethod lambda$Fn52 = null;
    static final ModuleMethod lambda$Fn53 = null;
    static final ModuleMethod lambda$Fn54 = null;
    static final ModuleMethod lambda$Fn55 = null;
    static final ModuleMethod lambda$Fn56 = null;
    static final ModuleMethod lambda$Fn57 = null;
    static final ModuleMethod lambda$Fn58 = null;
    static final ModuleMethod lambda$Fn59 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn60 = null;
    static final ModuleMethod lambda$Fn61 = null;
    static final ModuleMethod lambda$Fn62 = null;
    static final ModuleMethod lambda$Fn63 = null;
    static final ModuleMethod lambda$Fn64 = null;
    static final ModuleMethod lambda$Fn65 = null;
    static final ModuleMethod lambda$Fn66 = null;
    static final ModuleMethod lambda$Fn67 = null;
    static final ModuleMethod lambda$Fn69 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn70 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    static final ModuleMethod proc$Fn68 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public ActivityStarter Activity_Starter1;
    public Button ButtonKembali;
    public final ModuleMethod ButtonKembali$Click;
    public Button ButtonSimpan;
    public final ModuleMethod ButtonSimpan$Click;
    public MakeroidCardView Card_View1;
    public MakeroidCardView Card_View2;
    public MakeroidCardView Card_View3;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public DatePicker Date_PickerKunjungan;
    public final ModuleMethod Date_PickerKunjungan$AfterDateSet;
    public Decoration Decoration1;
    public GoogleMap Google_Maps1;
    public HorizontalArrangement Horizontal_Arrangement1;
    public Label LabelCatatan;
    public ListPicker List_PickerHasil;
    public final ModuleMethod List_PickerHasil$AfterPicking;
    public ListPicker List_PickerNus;
    public final ModuleMethod List_PickerNus$AfterPicking;
    public LocationSensor Location_Sensor1;
    public final ModuleMethod Location_Sensor1$LocationChanged;
    public Notifier Notifier1;
    public Notifier Notifier2;
    public final ModuleMethod Notifier2$AfterChoosing;
    public SpaceView Space1;
    public SpaceView Space2;
    public SpaceView Space3;
    public SpaceView Space4;
    public SpaceView Space5;
    public SpaceView Space6;
    public SpaceView Space7;
    public TextBox Text_BoxAlamat;
    public TextBox Text_BoxCatatan;
    public TextBox Text_BoxDurasi;
    public TextBox Text_BoxHasilPencacahan;
    public TextBox Text_BoxKunjungan;
    public TextBox Text_BoxLat;
    public TextBox Text_BoxLong;
    public TextBox Text_BoxMulai;
    public TextBox Text_BoxNKS;
    public TextBox Text_BoxNus;
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
    public final ModuleMethod entrypcl$BackPressed;
    public final ModuleMethod entrypcl$Initialize;
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
    static final SimpleSymbol Lit324 = (SimpleSymbol) new SimpleSymbol("component").readResolve();
    static final SimpleSymbol Lit323 = (SimpleSymbol) new SimpleSymbol("InstantInTime").readResolve();
    static final SimpleSymbol Lit322 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
    static final SimpleSymbol Lit321 = (SimpleSymbol) new SimpleSymbol("proc").readResolve();
    static final SimpleSymbol Lit320 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
    static final SimpleSymbol Lit319 = (SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve();
    static final SimpleSymbol Lit318 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
    static final SimpleSymbol Lit317 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
    static final SimpleSymbol Lit316 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    static final SimpleSymbol Lit315 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
    static final SimpleSymbol Lit314 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
    static final SimpleSymbol Lit313 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
    static final SimpleSymbol Lit312 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
    static final SimpleSymbol Lit311 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
    static final SimpleSymbol Lit310 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
    static final SimpleSymbol Lit309 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
    static final SimpleSymbol Lit308 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
    static final SimpleSymbol Lit307 = (SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve();
    static final SimpleSymbol Lit306 = (SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve();
    static final SimpleSymbol Lit305 = (SimpleSymbol) new SimpleSymbol("Notifier2$AfterChoosing").readResolve();
    static final PairWithPosition Lit304 = PairWithPosition.make(Lit322, PairWithPosition.make(Lit322, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1663074), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1663069);
    static final SimpleSymbol Lit303 = (SimpleSymbol) new SimpleSymbol("$choice").readResolve();
    static final FString Lit302 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit301 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit300 = (SimpleSymbol) new SimpleSymbol("GotText").readResolve();
    static final SimpleSymbol Lit299 = (SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve();

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit20 = simpleSymbol;
        Lit298 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1635249), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1635244), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1635238);
        Lit297 = (SimpleSymbol) new SimpleSymbol("ShowMessageDialog").readResolve();
        Lit296 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit322, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1635041), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1635035);
        Lit295 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1635018), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1635013), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1635007);
        SimpleSymbol simpleSymbol2 = Lit20;
        SimpleSymbol simpleSymbol3 = Lit20;
        SimpleSymbol simpleSymbol4 = Lit20;
        SimpleSymbol simpleSymbol5 = Lit20;
        SimpleSymbol simpleSymbol6 = (SimpleSymbol) new SimpleSymbol("boolean").readResolve();
        Lit25 = simpleSymbol6;
        Lit294 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol6, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1634782), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1634777), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1634772), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1634767), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1634761);
        Lit293 = (SimpleSymbol) new SimpleSymbol("DismissProgressDialog").readResolve();
        Lit292 = (SimpleSymbol) new SimpleSymbol("HideKeyboard").readResolve();
        Lit291 = (SimpleSymbol) new SimpleSymbol("$responseContent").readResolve();
        Lit290 = PairWithPosition.make(Lit322, PairWithPosition.make(Lit322, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1634407), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1634402);
        Lit289 = IntNum.make(200);
        Lit288 = (SimpleSymbol) new SimpleSymbol("$responseCode").readResolve();
        Lit287 = new FString("com.google.appinventor.components.runtime.Web");
        Lit286 = new FString("com.google.appinventor.components.runtime.Web");
        Lit285 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit284 = new FString("com.google.appinventor.components.runtime.Decoration");
        Lit283 = (SimpleSymbol) new SimpleSymbol("Timer").readResolve();
        Lit282 = (SimpleSymbol) new SimpleSymbol("Clock1$Timer").readResolve();
        Lit281 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1586049), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1586044), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1586039), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1586034), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1586028);
        SimpleSymbol simpleSymbol7 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit87 = simpleSymbol7;
        Lit280 = PairWithPosition.make(simpleSymbol7, PairWithPosition.make(Lit87, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1586006), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1585998);
        Lit279 = PairWithPosition.make(Lit87, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1585983);
        Lit278 = (SimpleSymbol) new SimpleSymbol("DurationToSeconds").readResolve();
        Lit277 = PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1585789), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1585781);
        Lit276 = IntNum.make(60);
        Lit275 = PairWithPosition.make(Lit87, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1585766);
        Lit274 = (SimpleSymbol) new SimpleSymbol("DurationToMinutes").readResolve();
        Lit273 = PairWithPosition.make(Lit87, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1585580);
        Lit272 = (SimpleSymbol) new SimpleSymbol("$DURATION").readResolve();
        Lit271 = (SimpleSymbol) new SimpleSymbol("DurationToHours").readResolve();
        Lit270 = PairWithPosition.make(Lit323, PairWithPosition.make(Lit323, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1585338), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1585323);
        Lit269 = (SimpleSymbol) new SimpleSymbol("Duration").readResolve();
        Lit268 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit267 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit266 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit265 = IntNum.make(new int[]{-17297400});
        Lit264 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit263 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit262 = (SimpleSymbol) new SimpleSymbol("Activity_Starter1").readResolve();
        Lit261 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit260 = (SimpleSymbol) new SimpleSymbol("LocationChanged").readResolve();
        Lit259 = (SimpleSymbol) new SimpleSymbol("Location_Sensor1$LocationChanged").readResolve();
        Lit258 = (SimpleSymbol) new SimpleSymbol("CurrentAddress").readResolve();
        Lit257 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507974);
        Lit256 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507957), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507952), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507947), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507942), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507937), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507932), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507927), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507922), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507916);
        Lit255 = (SimpleSymbol) new SimpleSymbol("AddMarkersFromJson").readResolve();
        Lit254 = PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507686), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507679), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507671);
        Lit253 = IntNum.make(15);
        Lit252 = (SimpleSymbol) new SimpleSymbol("$longitude").readResolve();
        Lit251 = (SimpleSymbol) new SimpleSymbol("$latitude").readResolve();
        Lit250 = (SimpleSymbol) new SimpleSymbol("MoveCamera").readResolve();
        Lit249 = (SimpleSymbol) new SimpleSymbol("GetAllMarkerID").readResolve();
        Lit248 = PairWithPosition.make(Lit87, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1507452);
        Lit247 = (SimpleSymbol) new SimpleSymbol("$item").readResolve();
        Lit246 = (SimpleSymbol) new SimpleSymbol("RemoveMarker").readResolve();
        Lit245 = new FString("com.google.appinventor.components.runtime.LocationSensor");
        Lit244 = (SimpleSymbol) new SimpleSymbol("Location_Sensor1").readResolve();
        Lit243 = new FString("com.google.appinventor.components.runtime.LocationSensor");
        Lit242 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit241 = IntNum.make(-1007);
        Lit240 = (SimpleSymbol) new SimpleSymbol("Space4").readResolve();
        Lit239 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit238 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit237 = IntNum.make(-1010);
        Lit236 = (SimpleSymbol) new SimpleSymbol("Space3").readResolve();
        Lit235 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit234 = (SimpleSymbol) new SimpleSymbol("ButtonSimpan$Click").readResolve();
        Lit233 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1425060);
        Lit232 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1425043), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1425038), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1425033), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1425028), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1425023), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1425018), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1425013), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1425008), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1425003), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424998), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424993), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424988), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424983), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424978), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424973), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424968), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424963), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424958), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424953), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424948), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424943), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424938), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424932);
        Lit231 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424914), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424909), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424904), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424898);
        Lit230 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424264), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424259), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424254), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1424248);
        Lit229 = (SimpleSymbol) new SimpleSymbol("PostText").readResolve();
        Lit228 = (SimpleSymbol) new SimpleSymbol("Url").readResolve();
        Lit227 = (SimpleSymbol) new SimpleSymbol("Web1").readResolve();
        Lit226 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1423811), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1423805);
        Lit225 = (SimpleSymbol) new SimpleSymbol("ShowProgressDialog").readResolve();
        Lit224 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1423579);
        Lit223 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1423445);
        Lit222 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1423241);
        Lit221 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1423106);
        Lit220 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1422914);
        Lit219 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1422777);
        Lit218 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1422590);
        Lit217 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1422463);
        Lit216 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1422276);
        Lit215 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1422150);
        Lit214 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1422039);
        Lit213 = PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1421905), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1421897);
        Lit212 = PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1421803), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1421795);
        Lit211 = IntNum.make(8);
        Lit210 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1421774);
        Lit209 = (SimpleSymbol) new SimpleSymbol("RequestFocus").readResolve();
        Lit208 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1421533);
        Lit207 = (SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve();
        Lit206 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit205 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 1421412);
        Lit204 = new FString("com.google.appinventor.components.runtime.Button");
        Lit203 = IntNum.make(new int[]{-32892943});
        Lit202 = new FString("com.google.appinventor.components.runtime.Button");
        Lit201 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit200 = IntNum.make(-1010);
        Lit199 = (SimpleSymbol) new SimpleSymbol("Space2").readResolve();
        Lit198 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit197 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit196 = (SimpleSymbol) new SimpleSymbol("ButtonKembali$Click").readResolve();
        Lit195 = new FString("com.google.appinventor.components.runtime.Button");
        Lit194 = IntNum.make(new int[]{-18672371});
        Lit193 = new FString("com.google.appinventor.components.runtime.Button");
        Lit192 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit191 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement1").readResolve();
        Lit190 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit189 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit188 = (SimpleSymbol) new SimpleSymbol("Text_BoxDurasi").readResolve();
        Lit187 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit186 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit185 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit184 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit183 = (SimpleSymbol) new SimpleSymbol("Card_View3").readResolve();
        Lit182 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit181 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit180 = IntNum.make(-1080);
        Lit179 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit178 = new FString("com.google.appinventor.components.runtime.Label");
        Lit177 = IntNum.make(new int[]{-32892943});
        Lit176 = (SimpleSymbol) new SimpleSymbol("LabelCatatan").readResolve();
        Lit175 = new FString("com.google.appinventor.components.runtime.Label");
        Lit174 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit173 = IntNum.make(-1005);
        Lit172 = (SimpleSymbol) new SimpleSymbol("Space7").readResolve();
        Lit171 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit170 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit169 = IntNum.make(new int[]{-32892943});
        Lit168 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit167 = (SimpleSymbol) new SimpleSymbol("List_PickerHasil$AfterPicking").readResolve();
        Lit166 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit165 = IntNum.make(new int[]{-18672371});
        Lit164 = (SimpleSymbol) new SimpleSymbol("List_PickerHasil").readResolve();
        Lit163 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit162 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit161 = IntNum.make(-1002);
        Lit160 = (SimpleSymbol) new SimpleSymbol("Space6").readResolve();
        Lit159 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit158 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit157 = IntNum.make(new int[]{-32892943});
        Lit156 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit155 = (SimpleSymbol) new SimpleSymbol("AfterDateSet").readResolve();
        Lit154 = (SimpleSymbol) new SimpleSymbol("Date_PickerKunjungan$AfterDateSet").readResolve();
        Lit153 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 766294), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 766289), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 766284), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 766279), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 766273);
        Lit152 = (SimpleSymbol) new SimpleSymbol("Year").readResolve();
        Lit151 = (SimpleSymbol) new SimpleSymbol("Month").readResolve();
        Lit150 = (SimpleSymbol) new SimpleSymbol("Day").readResolve();
        Lit149 = new FString("com.google.appinventor.components.runtime.DatePicker");
        Lit148 = IntNum.make(new int[]{-18672371});
        Lit147 = (SimpleSymbol) new SimpleSymbol("Date_PickerKunjungan").readResolve();
        Lit146 = new FString("com.google.appinventor.components.runtime.DatePicker");
        Lit145 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit144 = IntNum.make(-1010);
        Lit143 = IntNum.make(-1002);
        Lit142 = (SimpleSymbol) new SimpleSymbol("Space5").readResolve();
        Lit141 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit140 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit139 = IntNum.make(new int[]{-32892943});
        Lit138 = IntNum.make(17);
        Lit137 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit136 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit135 = (SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve();
        Lit134 = (SimpleSymbol) new SimpleSymbol("List_PickerNus$AfterPicking").readResolve();
        Lit133 = (SimpleSymbol) new SimpleSymbol("Visible").readResolve();
        Lit132 = (SimpleSymbol) new SimpleSymbol("$selection").readResolve();
        Lit131 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit130 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit129 = (SimpleSymbol) new SimpleSymbol("ElementsFromString").readResolve();
        Lit128 = IntNum.make(new int[]{-18672371});
        Lit127 = (SimpleSymbol) new SimpleSymbol("List_PickerNus").readResolve();
        Lit126 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit125 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit124 = (SimpleSymbol) new SimpleSymbol("Card_View2").readResolve();
        Lit123 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit122 = new FString("com.google.appinventor.components.runtime.GoogleMap");
        Lit121 = IntNum.make(-1025);
        Lit120 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit119 = (SimpleSymbol) new SimpleSymbol("Google_Maps1").readResolve();
        Lit118 = new FString("com.google.appinventor.components.runtime.GoogleMap");
        Lit117 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit116 = IntNum.make(new int[]{-18672371});
        Lit115 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit114 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit113 = IntNum.make(new int[]{-18672371});
        Lit112 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit111 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit110 = IntNum.make(-1080);
        Lit109 = IntNum.make(new int[]{-18672371});
        Lit108 = (SimpleSymbol) new SimpleSymbol("MultiLine").readResolve();
        Lit107 = (SimpleSymbol) new SimpleSymbol("Hint").readResolve();
        Lit106 = IntNum.make(16777215);
        Lit105 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit104 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit103 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit102 = IntNum.make(new int[]{-18672371});
        Lit101 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit100 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit99 = (SimpleSymbol) new SimpleSymbol("ReadOnly").readResolve();
        Lit98 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit97 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit96 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit95 = IntNum.make(-2);
        Lit94 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit93 = IntNum.make(5);
        Lit92 = (SimpleSymbol) new SimpleSymbol("StrokeWidth").readResolve();
        Lit91 = IntNum.make(new int[]{-18672371});
        Lit90 = (SimpleSymbol) new SimpleSymbol("StrokeColor").readResolve();
        Lit89 = IntNum.make(2);
        Lit88 = (SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve();
        Lit86 = IntNum.make(3);
        Lit85 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit84 = (SimpleSymbol) new SimpleSymbol("Card_View1").readResolve();
        Lit83 = new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit82 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit81 = (SimpleSymbol) new SimpleSymbol("Space1").readResolve();
        Lit80 = new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit79 = (SimpleSymbol) new SimpleSymbol("BackPressed").readResolve();
        Lit78 = (SimpleSymbol) new SimpleSymbol("entrypcl$BackPressed").readResolve();
        Lit77 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 110763), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 110758), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 110753), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 110748), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 110742);
        Lit76 = (SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve();
        Lit75 = (SimpleSymbol) new SimpleSymbol("Notifier2").readResolve();
        Lit74 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit73 = (SimpleSymbol) new SimpleSymbol("entrypcl$Initialize").readResolve();
        Lit72 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("list").readResolve(), PairWithPosition.make(Lit87, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104633), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104627);
        Lit71 = (SimpleSymbol) new SimpleSymbol("$data").readResolve();
        Lit70 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104475), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104469);
        Lit69 = PairWithPosition.make(Lit324, PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104263), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104256), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104249), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104238);
        Lit68 = IntNum.make(-13369549);
        Lit67 = IntNum.make(-16777063);
        Lit66 = (SimpleSymbol) new SimpleSymbol("ButtonSimpan").readResolve();
        Lit65 = PairWithPosition.make(Lit324, PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104106), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104099), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104092), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 104081);
        Lit64 = IntNum.make(-13369549);
        Lit63 = IntNum.make((int) SupportMenu.CATEGORY_MASK);
        Lit62 = (SimpleSymbol) new SimpleSymbol("ButtonKembali").readResolve();
        Lit61 = PairWithPosition.make(Lit324, PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103951), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103944), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103937), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103926);
        Lit60 = IntNum.make((int) Component.COLOR_GREEN);
        Lit59 = (SimpleSymbol) new SimpleSymbol("Text_BoxCatatan").readResolve();
        Lit58 = PairWithPosition.make(Lit324, PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103798), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103791), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103784), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103773);
        Lit57 = IntNum.make((int) Component.COLOR_GREEN);
        Lit56 = (SimpleSymbol) new SimpleSymbol("Text_BoxHasilPencacahan").readResolve();
        Lit55 = PairWithPosition.make(Lit324, PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103637), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103630), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103623), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103612);
        Lit54 = IntNum.make((int) Component.COLOR_INDIGO);
        Lit53 = (SimpleSymbol) new SimpleSymbol("Text_BoxKunjungan").readResolve();
        Lit52 = PairWithPosition.make(Lit324, PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103482), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103475), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103468), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103457);
        Lit51 = IntNum.make((int) Component.COLOR_INDIGO);
        Lit50 = (SimpleSymbol) new SimpleSymbol("Text_BoxNus").readResolve();
        Lit49 = PairWithPosition.make(Lit324, PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103333), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103326), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103319), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103308);
        Lit48 = IntNum.make(-3407872);
        Lit47 = (SimpleSymbol) new SimpleSymbol("Text_BoxLong").readResolve();
        Lit46 = PairWithPosition.make(Lit324, PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103184), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103177), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103170), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103159);
        Lit45 = IntNum.make(-3407872);
        Lit44 = (SimpleSymbol) new SimpleSymbol("Text_BoxLat").readResolve();
        Lit43 = PairWithPosition.make(Lit324, PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103036), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103029), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103022), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 103011);
        Lit42 = IntNum.make(-3407872);
        Lit41 = (SimpleSymbol) new SimpleSymbol("Text_BoxAlamat").readResolve();
        Lit40 = PairWithPosition.make(Lit324, PairWithPosition.make(Lit87, PairWithPosition.make(Lit87, PairWithPosition.make(Lit25, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 102885), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 102878), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 102871), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 102860);
        Lit39 = IntNum.make(-3407872);
        Lit38 = IntNum.make(-1);
        Lit37 = (SimpleSymbol) new SimpleSymbol("Text_BoxNKS").readResolve();
        Lit36 = (SimpleSymbol) new SimpleSymbol("SetShape").readResolve();
        Lit35 = (SimpleSymbol) new SimpleSymbol("Decoration1").readResolve();
        Lit34 = PairWithPosition.make(Lit323, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 102723);
        Lit33 = (SimpleSymbol) new SimpleSymbol("FormatTime").readResolve();
        Lit32 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit31 = (SimpleSymbol) new SimpleSymbol("Text_BoxMulai").readResolve();
        Lit30 = (SimpleSymbol) new SimpleSymbol("Now").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("TimerEnabled").readResolve();
        Lit28 = (SimpleSymbol) new SimpleSymbol("Clock1").readResolve();
        Lit27 = (SimpleSymbol) new SimpleSymbol("TitleBarSubTitle").readResolve();
        Lit26 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit24 = (SimpleSymbol) new SimpleSymbol("Scrollable").readResolve();
        Lit23 = (SimpleSymbol) new SimpleSymbol("ReceiveSharedText").readResolve();
        Lit22 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit21 = (SimpleSymbol) new SimpleSymbol("AppId").readResolve();
        Lit19 = (SimpleSymbol) new SimpleSymbol("AboutScreenTitle").readResolve();
        Lit18 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 49265);
        Lit17 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 49265);
        Lit16 = (SimpleSymbol) new SimpleSymbol("p$goto").readResolve();
        Lit15 = (SimpleSymbol) new SimpleSymbol("g$Respon").readResolve();
        Lit14 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 41237), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 41231);
        Lit13 = PairWithPosition.make(Lit322, PairWithPosition.make(Lit322, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 41140), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 41135);
        Lit12 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 41114);
        Lit11 = PairWithPosition.make(Lit20, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 41237), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 41231);
        Lit10 = PairWithPosition.make(Lit322, PairWithPosition.make(Lit322, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 41140), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 41135);
        Lit9 = IntNum.make(1);
        Lit8 = PairWithPosition.make(Lit20, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/entrypcl.yail", 41114);
        Lit7 = (SimpleSymbol) new SimpleSymbol("$x").readResolve();
        Lit6 = (SimpleSymbol) new SimpleSymbol("p$Decimal").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("g$StartTime").readResolve();
        Lit4 = IntNum.make(0);
        Lit3 = (SimpleSymbol) new SimpleSymbol("g$Btn").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("entrypcl").readResolve();
    }

    public entrypcl() {
        ModuleInfo.register(this);
        frame frameVar = new frame();
        frameVar.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frameVar, 1, Lit307, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frameVar, 2, Lit308, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frameVar, 3, Lit309, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 4, Lit310, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 6, Lit311, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frameVar, 7, Lit312, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frameVar, 8, Lit313, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frameVar, 9, Lit314, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frameVar, 10, Lit315, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frameVar, 11, Lit316, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frameVar, 12, Lit317, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frameVar, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frameVar, 14, Lit318, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frameVar, 15, Lit319, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frameVar, 16, Lit320, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frameVar, 17, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6458243650290595638.scm:615");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frameVar, 18, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frameVar, 19, null, 0);
        lambda$Fn3 = new ModuleMethod(frameVar, 20, null, 0);
        lambda$Fn4 = new ModuleMethod(frameVar, 21, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn6 = new ModuleMethod(frameVar, 22, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn5 = new ModuleMethod(frameVar, 23, null, 0);
        lambda$Fn7 = new ModuleMethod(frameVar, 24, null, 0);
        lambda$Fn8 = new ModuleMethod(frameVar, 25, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn10 = new ModuleMethod(frameVar, 26, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn9 = new ModuleMethod(frameVar, 27, null, 0);
        lambda$Fn11 = new ModuleMethod(frameVar, 28, null, 0);
        this.entrypcl$Initialize = new ModuleMethod(frameVar, 29, Lit73, 0);
        this.entrypcl$BackPressed = new ModuleMethod(frameVar, 30, Lit78, 0);
        lambda$Fn12 = new ModuleMethod(frameVar, 31, null, 0);
        lambda$Fn13 = new ModuleMethod(frameVar, 32, null, 0);
        lambda$Fn14 = new ModuleMethod(frameVar, 33, null, 0);
        lambda$Fn15 = new ModuleMethod(frameVar, 34, null, 0);
        lambda$Fn16 = new ModuleMethod(frameVar, 35, null, 0);
        lambda$Fn17 = new ModuleMethod(frameVar, 36, null, 0);
        lambda$Fn18 = new ModuleMethod(frameVar, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(frameVar, 38, null, 0);
        lambda$Fn20 = new ModuleMethod(frameVar, 39, null, 0);
        lambda$Fn21 = new ModuleMethod(frameVar, 40, null, 0);
        lambda$Fn22 = new ModuleMethod(frameVar, 41, null, 0);
        lambda$Fn23 = new ModuleMethod(frameVar, 42, null, 0);
        lambda$Fn24 = new ModuleMethod(frameVar, 43, null, 0);
        lambda$Fn25 = new ModuleMethod(frameVar, 44, null, 0);
        lambda$Fn26 = new ModuleMethod(frameVar, 45, null, 0);
        lambda$Fn27 = new ModuleMethod(frameVar, 46, null, 0);
        this.List_PickerNus$AfterPicking = new ModuleMethod(frameVar, 47, Lit134, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn28 = new ModuleMethod(frameVar, 48, null, 0);
        lambda$Fn29 = new ModuleMethod(frameVar, 49, null, 0);
        lambda$Fn30 = new ModuleMethod(frameVar, 50, null, 0);
        lambda$Fn31 = new ModuleMethod(frameVar, 51, null, 0);
        lambda$Fn32 = new ModuleMethod(frameVar, 52, null, 0);
        lambda$Fn33 = new ModuleMethod(frameVar, 53, null, 0);
        this.Date_PickerKunjungan$AfterDateSet = new ModuleMethod(frameVar, 54, Lit154, 0);
        lambda$Fn34 = new ModuleMethod(frameVar, 55, null, 0);
        lambda$Fn35 = new ModuleMethod(frameVar, 56, null, 0);
        lambda$Fn36 = new ModuleMethod(frameVar, 57, null, 0);
        lambda$Fn37 = new ModuleMethod(frameVar, 58, null, 0);
        lambda$Fn38 = new ModuleMethod(frameVar, 59, null, 0);
        lambda$Fn39 = new ModuleMethod(frameVar, 60, null, 0);
        this.List_PickerHasil$AfterPicking = new ModuleMethod(frameVar, 61, Lit167, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn40 = new ModuleMethod(frameVar, 62, null, 0);
        lambda$Fn41 = new ModuleMethod(frameVar, 63, null, 0);
        lambda$Fn42 = new ModuleMethod(frameVar, 64, null, 0);
        lambda$Fn43 = new ModuleMethod(frameVar, 65, null, 0);
        lambda$Fn44 = new ModuleMethod(frameVar, 66, null, 0);
        lambda$Fn45 = new ModuleMethod(frameVar, 67, null, 0);
        lambda$Fn46 = new ModuleMethod(frameVar, 68, null, 0);
        lambda$Fn47 = new ModuleMethod(frameVar, 69, null, 0);
        lambda$Fn48 = new ModuleMethod(frameVar, 70, null, 0);
        lambda$Fn49 = new ModuleMethod(frameVar, 71, null, 0);
        lambda$Fn50 = new ModuleMethod(frameVar, 72, null, 0);
        lambda$Fn51 = new ModuleMethod(frameVar, 73, null, 0);
        lambda$Fn52 = new ModuleMethod(frameVar, 74, null, 0);
        lambda$Fn53 = new ModuleMethod(frameVar, 75, null, 0);
        lambda$Fn54 = new ModuleMethod(frameVar, 76, null, 0);
        lambda$Fn55 = new ModuleMethod(frameVar, 77, null, 0);
        lambda$Fn56 = new ModuleMethod(frameVar, 78, null, 0);
        lambda$Fn57 = new ModuleMethod(frameVar, 79, null, 0);
        this.ButtonKembali$Click = new ModuleMethod(frameVar, 80, Lit196, 0);
        lambda$Fn58 = new ModuleMethod(frameVar, 81, null, 0);
        lambda$Fn59 = new ModuleMethod(frameVar, 82, null, 0);
        lambda$Fn60 = new ModuleMethod(frameVar, 83, null, 0);
        lambda$Fn61 = new ModuleMethod(frameVar, 84, null, 0);
        lambda$Fn62 = new ModuleMethod(frameVar, 85, null, 0);
        lambda$Fn63 = new ModuleMethod(frameVar, 86, null, 0);
        this.ButtonSimpan$Click = new ModuleMethod(frameVar, 87, Lit234, 0);
        lambda$Fn64 = new ModuleMethod(frameVar, 88, null, 0);
        lambda$Fn65 = new ModuleMethod(frameVar, 89, null, 0);
        lambda$Fn66 = new ModuleMethod(frameVar, 90, null, 0);
        lambda$Fn67 = new ModuleMethod(frameVar, 91, null, 0);
        proc$Fn68 = new ModuleMethod(frameVar, 92, Lit321, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Location_Sensor1$LocationChanged = new ModuleMethod(frameVar, 93, Lit259, 16388);
        lambda$Fn69 = new ModuleMethod(frameVar, 94, null, 0);
        lambda$Fn70 = new ModuleMethod(frameVar, 95, null, 0);
        this.Clock1$Timer = new ModuleMethod(frameVar, 96, Lit282, 0);
        this.Web1$GotText = new ModuleMethod(frameVar, 97, Lit299, 16388);
        this.Notifier2$AfterChoosing = new ModuleMethod(frameVar, 98, Lit305, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
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
        entrypcl = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, Lit4), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit5, Lit4), $result);
        } else {
            addToGlobalVars(Lit5, lambda$Fn3);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit6, lambda$Fn4), $result);
        } else {
            addToGlobalVars(Lit6, lambda$Fn5);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit15, ""), $result);
        } else {
            addToGlobalVars(Lit15, lambda$Fn7);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit16, lambda$Fn8), $result);
        } else {
            addToGlobalVars(Lit16, lambda$Fn9);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "SIMPEL SAKERNAS", Lit20);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "5510172111798272", Lit20);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "SIMPELSAK22", Lit20);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit23, AlgorithmIdentifiers.NONE, Lit20);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.TRUE, Lit25);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit26, "SIMPEL SAK FEB 2022", Lit20);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "PCL", Lit20), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn11));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit73, this.entrypcl$Initialize);
        } else {
            addToFormEnvironment(Lit73, this.entrypcl$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "entrypcl", "Initialize");
        } else {
            addToEvents(Lit0, Lit74);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit78, this.entrypcl$BackPressed);
        } else {
            addToFormEnvironment(Lit78, this.entrypcl$BackPressed);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "entrypcl", "BackPressed");
        } else {
            addToEvents(Lit0, Lit79);
        }
        this.Space1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit80, Lit81, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit82, Lit81, Boolean.FALSE);
        }
        this.Card_View1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit83, Lit84, lambda$Fn12), $result);
        } else {
            addToComponents(Lit0, Lit96, Lit84, lambda$Fn13);
        }
        this.Text_BoxNKS = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit97, Lit37, lambda$Fn14), $result);
        } else {
            addToComponents(Lit84, Lit103, Lit37, lambda$Fn15);
        }
        this.Text_BoxAlamat = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit104, Lit41, lambda$Fn16), $result);
        } else {
            addToComponents(Lit84, Lit111, Lit41, lambda$Fn17);
        }
        this.Text_BoxLat = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit112, Lit44, lambda$Fn18), $result);
        } else {
            addToComponents(Lit84, Lit114, Lit44, lambda$Fn19);
        }
        this.Text_BoxLong = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit84, Lit115, Lit47, lambda$Fn20), $result);
        } else {
            addToComponents(Lit84, Lit117, Lit47, lambda$Fn21);
        }
        this.Google_Maps1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit118, Lit119, lambda$Fn22), $result);
        } else {
            addToComponents(Lit0, Lit122, Lit119, lambda$Fn23);
        }
        this.Card_View2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit123, Lit124, lambda$Fn24), $result);
        } else {
            addToComponents(Lit0, Lit125, Lit124, lambda$Fn25);
        }
        this.List_PickerNus = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit124, Lit126, Lit127, lambda$Fn26), $result);
        } else {
            addToComponents(Lit124, Lit131, Lit127, lambda$Fn27);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit134, this.List_PickerNus$AfterPicking);
        } else {
            addToFormEnvironment(Lit134, this.List_PickerNus$AfterPicking);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "List_PickerNus", "AfterPicking");
        } else {
            addToEvents(Lit127, Lit135);
        }
        this.Text_BoxNus = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit124, Lit136, Lit50, lambda$Fn28), $result);
        } else {
            addToComponents(Lit124, Lit140, Lit50, lambda$Fn29);
        }
        this.Space5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit124, Lit141, Lit142, lambda$Fn30), $result);
        } else {
            addToComponents(Lit124, Lit145, Lit142, lambda$Fn31);
        }
        this.Date_PickerKunjungan = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit124, Lit146, Lit147, lambda$Fn32), $result);
        } else {
            addToComponents(Lit124, Lit149, Lit147, lambda$Fn33);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit154, this.Date_PickerKunjungan$AfterDateSet);
        } else {
            addToFormEnvironment(Lit154, this.Date_PickerKunjungan$AfterDateSet);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Date_PickerKunjungan", "AfterDateSet");
        } else {
            addToEvents(Lit147, Lit155);
        }
        this.Text_BoxKunjungan = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit124, Lit156, Lit53, lambda$Fn34), $result);
        } else {
            addToComponents(Lit124, Lit158, Lit53, lambda$Fn35);
        }
        this.Space6 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit124, Lit159, Lit160, lambda$Fn36), $result);
        } else {
            addToComponents(Lit124, Lit162, Lit160, lambda$Fn37);
        }
        this.List_PickerHasil = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit124, Lit163, Lit164, lambda$Fn38), $result);
        } else {
            addToComponents(Lit124, Lit166, Lit164, lambda$Fn39);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit167, this.List_PickerHasil$AfterPicking);
        } else {
            addToFormEnvironment(Lit167, this.List_PickerHasil$AfterPicking);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "List_PickerHasil", "AfterPicking");
        } else {
            addToEvents(Lit164, Lit135);
        }
        this.Text_BoxHasilPencacahan = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit124, Lit168, Lit56, lambda$Fn40), $result);
        } else {
            addToComponents(Lit124, Lit170, Lit56, lambda$Fn41);
        }
        this.Space7 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit124, Lit171, Lit172, lambda$Fn42), $result);
        } else {
            addToComponents(Lit124, Lit174, Lit172, lambda$Fn43);
        }
        this.LabelCatatan = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit124, Lit175, Lit176, lambda$Fn44), $result);
        } else {
            addToComponents(Lit124, Lit178, Lit176, lambda$Fn45);
        }
        this.Text_BoxCatatan = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit124, Lit179, Lit59, lambda$Fn46), $result);
        } else {
            addToComponents(Lit124, Lit181, Lit59, lambda$Fn47);
        }
        this.Card_View3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit182, Lit183, lambda$Fn48), $result);
        } else {
            addToComponents(Lit0, Lit184, Lit183, lambda$Fn49);
        }
        this.Text_BoxMulai = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit183, Lit185, Lit31, lambda$Fn50), $result);
        } else {
            addToComponents(Lit183, Lit186, Lit31, lambda$Fn51);
        }
        this.Text_BoxDurasi = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit183, Lit187, Lit188, lambda$Fn52), $result);
        } else {
            addToComponents(Lit183, Lit189, Lit188, lambda$Fn53);
        }
        this.Horizontal_Arrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit190, Lit191, lambda$Fn54), $result);
        } else {
            addToComponents(Lit0, Lit192, Lit191, lambda$Fn55);
        }
        this.ButtonKembali = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit191, Lit193, Lit62, lambda$Fn56), $result);
        } else {
            addToComponents(Lit191, Lit195, Lit62, lambda$Fn57);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit196, this.ButtonKembali$Click);
        } else {
            addToFormEnvironment(Lit196, this.ButtonKembali$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonKembali", "Click");
        } else {
            addToEvents(Lit62, Lit197);
        }
        this.Space2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit191, Lit198, Lit199, lambda$Fn58), $result);
        } else {
            addToComponents(Lit191, Lit201, Lit199, lambda$Fn59);
        }
        this.ButtonSimpan = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit191, Lit202, Lit66, lambda$Fn60), $result);
        } else {
            addToComponents(Lit191, Lit204, Lit66, lambda$Fn61);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit234, this.ButtonSimpan$Click);
        } else {
            addToFormEnvironment(Lit234, this.ButtonSimpan$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ButtonSimpan", "Click");
        } else {
            addToEvents(Lit66, Lit197);
        }
        this.Space3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit191, Lit235, Lit236, lambda$Fn64), $result);
        } else {
            addToComponents(Lit191, Lit238, Lit236, lambda$Fn65);
        }
        this.Space4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit239, Lit240, lambda$Fn66), $result);
        } else {
            addToComponents(Lit0, Lit242, Lit240, lambda$Fn67);
        }
        this.Location_Sensor1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit243, Lit244, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit245, Lit244, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit259, this.Location_Sensor1$LocationChanged);
        } else {
            addToFormEnvironment(Lit259, this.Location_Sensor1$LocationChanged);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Location_Sensor1", "LocationChanged");
        } else {
            addToEvents(Lit244, Lit260);
        }
        this.Activity_Starter1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit261, Lit262, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit263, Lit262, Boolean.FALSE);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit264, Lit206, lambda$Fn69), $result);
        } else {
            addToComponents(Lit0, Lit266, Lit206, lambda$Fn70);
        }
        this.Clock1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit267, Lit28, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit268, Lit28, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit282, this.Clock1$Timer);
        } else {
            addToFormEnvironment(Lit282, this.Clock1$Timer);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
        } else {
            addToEvents(Lit28, Lit283);
        }
        this.Decoration1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit284, Lit35, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit285, Lit35, Boolean.FALSE);
        }
        this.Web1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit286, Lit227, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit287, Lit227, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit299, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit299, this.Web1$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit227, Lit300);
        }
        this.Notifier2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit301, Lit75, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit302, Lit75, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit305, this.Notifier2$AfterChoosing);
        } else {
            addToFormEnvironment(Lit305, this.Notifier2$AfterChoosing);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier2", "AfterChoosing");
        } else {
            addToEvents(Lit75, Lit306);
        }
        runtime.initRuntime();
    }

    static IntNum lambda3() {
        return Lit4;
    }

    static IntNum lambda4() {
        return Lit4;
    }

    static Object lambda5(Object $x) {
        Object $x2;
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(strings.string$Mnlength, LList.list1($x instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit7), " is not bound in the current context"), "Unbound Variable") : $x), Lit8, "length"), Lit9), Lit10, "=") != Boolean.FALSE) {
            $x2 = runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("0", $x instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit7), " is not bound in the current context"), "Unbound Variable") : $x), Lit11, "join");
        } else {
            $x2 = $x instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit7), " is not bound in the current context"), "Unbound Variable") : $x;
        }
        return $x2;
    }

    static Procedure lambda6() {
        return lambda$Fn6;
    }

    static Object lambda7(Object $x) {
        Object $x2;
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(strings.string$Mnlength, LList.list1($x instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit7), " is not bound in the current context"), "Unbound Variable") : $x), Lit12, "length"), Lit9), Lit13, "=") != Boolean.FALSE) {
            $x2 = runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("0", $x instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit7), " is not bound in the current context"), "Unbound Variable") : $x), Lit14, "join");
        } else {
            $x2 = $x instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit7), " is not bound in the current context"), "Unbound Variable") : $x;
        }
        return $x2;
    }

    static String lambda8() {
        return "";
    }

    static Procedure lambda10() {
        return lambda$Fn10;
    }

    static Object lambda11(Object obj) {
        runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Screen1"), Lit18, "open another screen");
        Object $Screen = runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen");
        return $Screen;
    }

    static Object lambda9(Object obj) {
        runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Screen1"), Lit17, "open another screen");
        Object $Screen = runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen");
        return $Screen;
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "SIMPEL SAKERNAS", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "5510172111798272", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "SIMPELSAK22", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit23, AlgorithmIdentifiers.NONE, Lit20);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit26, "SIMPEL SAK FEB 2022", Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "PCL", Lit20);
    }

    public Object entrypcl$Initialize() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Boolean.TRUE, Lit25);
        runtime.addGlobalVarToCurrentFormEnvironment(Lit5, runtime.callComponentMethod(Lit28, Lit30, LList.Empty, LList.Empty));
        runtime.setAndCoerceProperty$Ex(Lit31, Lit32, runtime.callComponentMethod(Lit28, Lit33, LList.list1(runtime.callComponentMethod(Lit28, Lit30, LList.Empty, LList.Empty)), Lit34), Lit20);
        runtime.callComponentMethod(Lit35, Lit36, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit37), Lit38, Lit39, Boolean.TRUE), Lit40);
        runtime.callComponentMethod(Lit35, Lit36, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit41), Lit38, Lit42, Boolean.TRUE), Lit43);
        runtime.callComponentMethod(Lit35, Lit36, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit44), Lit38, Lit45, Boolean.TRUE), Lit46);
        runtime.callComponentMethod(Lit35, Lit36, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit47), Lit38, Lit48, Boolean.TRUE), Lit49);
        runtime.callComponentMethod(Lit35, Lit36, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit50), Lit38, Lit51, Boolean.TRUE), Lit52);
        runtime.callComponentMethod(Lit35, Lit36, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit53), Lit38, Lit54, Boolean.TRUE), Lit55);
        runtime.callComponentMethod(Lit35, Lit36, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit56), Lit38, Lit57, Boolean.TRUE), Lit58);
        runtime.callComponentMethod(Lit35, Lit36, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit59), Lit38, Lit60, Boolean.TRUE), Lit61);
        runtime.callComponentMethod(Lit35, Lit36, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit62), Lit63, Lit64, Boolean.TRUE), Lit65);
        runtime.callComponentMethod(Lit35, Lit36, LList.list4(runtime.lookupInCurrentFormEnvironment(Lit66), Lit67, Lit68, Boolean.TRUE), Lit69);
        runtime.addGlobalVarToCurrentFormEnvironment(Lit15, "");
        runtime.addGlobalVarToCurrentFormEnvironment(Lit3, "");
        Object $data = runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), ","), Lit70, "split");
        return runtime.setAndCoerceProperty$Ex(Lit37, Lit32, runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2($data instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit71), " is not bound in the current context"), "Unbound Variable") : $data, Lit9), Lit72, "select list item"), Lit20);
    }

    public Object entrypcl$BackPressed() {
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit75;
        SimpleSymbol simpleSymbol2 = Lit76;
        Pair list1 = LList.list1("Anda Yakin Mau Keluar Dari Aplikasi !!!");
        LList.chain4(list1, "Keluar", "Batal", "Ya", Boolean.FALSE);
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit77);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit84, Lit85, Lit86, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit88, Lit89, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit90, Lit91, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit92, Lit93, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit94, Lit95, Lit87);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit84, Lit85, Lit86, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit88, Lit89, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit90, Lit91, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit92, Lit93, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit94, Lit95, Lit87);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit37, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit37, Lit99, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit37, Lit100, Lit9, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit37, Lit101, Lit102, Lit87);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit37, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit37, Lit99, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit37, Lit100, Lit9, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit37, Lit101, Lit102, Lit87);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit105, Lit106, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit107, "Alamat", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit108, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit99, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit100, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit101, Lit109, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit94, Lit110, Lit87);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit105, Lit106, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit107, "Alamat", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit108, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit99, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit100, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit101, Lit109, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit94, Lit110, Lit87);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit107, "Latitude", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit99, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit100, Lit9, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit101, Lit113, Lit87);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit107, "Latitude", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit99, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit100, Lit9, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit101, Lit113, Lit87);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit107, "Longitude", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit99, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit100, Lit9, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit101, Lit116, Lit87);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit107, "Longitude", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit99, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit100, Lit9, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit101, Lit116, Lit87);
    }

    static Object lambda23() {
        return runtime.setAndCoerceProperty$Ex(Lit119, Lit120, Lit121, Lit87);
    }

    static Object lambda24() {
        return runtime.setAndCoerceProperty$Ex(Lit119, Lit120, Lit121, Lit87);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit124, Lit85, Lit86, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit124, Lit88, Lit89, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit124, Lit94, Lit95, Lit87);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit124, Lit85, Lit86, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit124, Lit88, Lit89, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit124, Lit94, Lit95, Lit87);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit127, Lit105, Lit128, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit127, Lit129, "01,02,03,04,05,06,07,08,09,10", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit127, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit127, Lit130, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit127, Lit32, "Nomor Urut Ruta Sampel", Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit127, Lit26, "NUS", Lit20);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit127, Lit105, Lit128, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit127, Lit129, "01,02,03,04,05,06,07,08,09,10", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit127, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit127, Lit130, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit127, Lit32, "Nomor Urut Ruta Sampel", Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit127, Lit26, "NUS", Lit20);
    }

    public Object List_PickerNus$AfterPicking(Object $selection) {
        Object $selection2 = runtime.sanitizeComponentData($selection);
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit50, Lit32, $selection2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit132), " is not bound in the current context"), "Unbound Variable") : $selection2, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit133, Boolean.TRUE, Lit25);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit50, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit137, Lit138, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit100, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit101, Lit139, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit133, Boolean.FALSE, Lit25);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit50, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit137, Lit138, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit100, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit101, Lit139, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit133, Boolean.FALSE, Lit25);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit142, Lit120, Lit143, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit142, Lit94, Lit144, Lit87);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit142, Lit120, Lit143, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit142, Lit94, Lit144, Lit87);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit147, Lit105, Lit148, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit147, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit147, Lit130, Lit9, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit147, Lit32, "Tanggal Kunjungan", Lit20);
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit147, Lit105, Lit148, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit147, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit147, Lit130, Lit9, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit147, Lit32, "Tanggal Kunjungan", Lit20);
    }

    public Object Date_PickerKunjungan$AfterDateSet() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit53, Lit133, Boolean.TRUE, Lit25);
        SimpleSymbol simpleSymbol = Lit53;
        SimpleSymbol simpleSymbol2 = Lit32;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair list1 = LList.list1(runtime.get$Mnproperty.apply2(Lit147, Lit150));
        LList.chain4(list1, " / ", runtime.get$Mnproperty.apply2(Lit147, Lit151), " / ", runtime.get$Mnproperty.apply2(Lit147, Lit152));
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, runtime.callYailPrimitive(moduleMethod, list1, Lit153, "join"), Lit20);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit53, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit137, Lit138, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit100, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit101, Lit157, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit133, Boolean.FALSE, Lit25);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit53, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit137, Lit138, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit100, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit101, Lit157, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit133, Boolean.FALSE, Lit25);
    }

    static Object lambda37() {
        return runtime.setAndCoerceProperty$Ex(Lit160, Lit120, Lit161, Lit87);
    }

    static Object lambda38() {
        return runtime.setAndCoerceProperty$Ex(Lit160, Lit120, Lit161, Lit87);
    }

    static Object lambda39() {
        runtime.setAndCoerceProperty$Ex(Lit164, Lit105, Lit165, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit129, "Berhasil,Menolak,Tidak Dapat Ditemui", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit130, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit32, "Hasil Pencacahan", Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit164, Lit26, "HASIL PENCACAHAN", Lit20);
    }

    static Object lambda40() {
        runtime.setAndCoerceProperty$Ex(Lit164, Lit105, Lit165, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit129, "Berhasil,Menolak,Tidak Dapat Ditemui", Lit20);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit130, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit164, Lit32, "Hasil Pencacahan", Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit164, Lit26, "HASIL PENCACAHAN", Lit20);
    }

    public Object List_PickerHasil$AfterPicking(Object $selection) {
        Object $selection2 = runtime.sanitizeComponentData($selection);
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit56, Lit32, $selection2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit132), " is not bound in the current context"), "Unbound Variable") : $selection2, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit133, Boolean.TRUE, Lit25);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit56, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit137, Lit138, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit100, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit101, Lit169, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit133, Boolean.FALSE, Lit25);
    }

    static Object lambda42() {
        runtime.setAndCoerceProperty$Ex(Lit56, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit137, Lit138, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit100, Lit9, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit101, Lit169, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit133, Boolean.FALSE, Lit25);
    }

    static Object lambda43() {
        return runtime.setAndCoerceProperty$Ex(Lit172, Lit120, Lit173, Lit87);
    }

    static Object lambda44() {
        return runtime.setAndCoerceProperty$Ex(Lit172, Lit120, Lit173, Lit87);
    }

    static Object lambda45() {
        runtime.setAndCoerceProperty$Ex(Lit176, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit176, Lit32, "Catatan", Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit176, Lit101, Lit177, Lit87);
    }

    static Object lambda46() {
        runtime.setAndCoerceProperty$Ex(Lit176, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit176, Lit32, "Catatan", Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit176, Lit101, Lit177, Lit87);
    }

    static Object lambda47() {
        runtime.setAndCoerceProperty$Ex(Lit59, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit59, Lit137, Lit138, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit59, Lit108, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit59, Lit94, Lit180, Lit87);
    }

    static Object lambda48() {
        runtime.setAndCoerceProperty$Ex(Lit59, Lit98, Boolean.TRUE, Lit25);
        runtime.setAndCoerceProperty$Ex(Lit59, Lit137, Lit138, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit59, Lit108, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit59, Lit94, Lit180, Lit87);
    }

    static Object lambda49() {
        runtime.setAndCoerceProperty$Ex(Lit183, Lit85, Lit86, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit183, Lit88, Lit89, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit183, Lit94, Lit95, Lit87);
    }

    static Object lambda50() {
        runtime.setAndCoerceProperty$Ex(Lit183, Lit85, Lit86, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit183, Lit88, Lit89, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit183, Lit94, Lit95, Lit87);
    }

    static Object lambda51() {
        runtime.setAndCoerceProperty$Ex(Lit31, Lit107, "Hint for Text_Box1", Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit133, Boolean.FALSE, Lit25);
    }

    static Object lambda52() {
        runtime.setAndCoerceProperty$Ex(Lit31, Lit107, "Hint for Text_Box1", Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit133, Boolean.FALSE, Lit25);
    }

    static Object lambda53() {
        runtime.setAndCoerceProperty$Ex(Lit188, Lit107, "Hint for Text_Box2", Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit188, Lit133, Boolean.FALSE, Lit25);
    }

    static Object lambda54() {
        runtime.setAndCoerceProperty$Ex(Lit188, Lit107, "Hint for Text_Box2", Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit188, Lit133, Boolean.FALSE, Lit25);
    }

    /* compiled from: entrypcl.yail */
    /* loaded from: classes.dex */
    public class frame extends ModuleBody {
        entrypcl $main;

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
                    if (obj instanceof entrypcl) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 21:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 22:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 25:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 26:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 47:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 61:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 92:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 98:
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
                    if (obj instanceof entrypcl) {
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
                    if (obj instanceof entrypcl) {
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
                case 93:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 97:
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
                case 93:
                    return this.$main.Location_Sensor1$LocationChanged(obj, obj2, obj3, obj4);
                case 97:
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

        @Override // gnu.expr.ModuleBody
        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 17:
                    return entrypcl.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return entrypcl.lambda3();
                case 20:
                    return entrypcl.lambda4();
                case 21:
                case 22:
                case 25:
                case 26:
                case 47:
                case 61:
                case 92:
                case 93:
                default:
                    return super.apply0(moduleMethod);
                case 23:
                    return entrypcl.lambda6();
                case 24:
                    return entrypcl.lambda8();
                case 27:
                    return entrypcl.lambda10();
                case 28:
                    return entrypcl.lambda12();
                case 29:
                    return this.$main.entrypcl$Initialize();
                case 30:
                    return this.$main.entrypcl$BackPressed();
                case 31:
                    return entrypcl.lambda13();
                case 32:
                    return entrypcl.lambda14();
                case 33:
                    return entrypcl.lambda15();
                case 34:
                    return entrypcl.lambda16();
                case 35:
                    return entrypcl.lambda17();
                case 36:
                    return entrypcl.lambda18();
                case 37:
                    return entrypcl.lambda19();
                case 38:
                    return entrypcl.lambda20();
                case 39:
                    return entrypcl.lambda21();
                case 40:
                    return entrypcl.lambda22();
                case 41:
                    return entrypcl.lambda23();
                case 42:
                    return entrypcl.lambda24();
                case 43:
                    return entrypcl.lambda25();
                case 44:
                    return entrypcl.lambda26();
                case 45:
                    return entrypcl.lambda27();
                case 46:
                    return entrypcl.lambda28();
                case 48:
                    return entrypcl.lambda29();
                case 49:
                    return entrypcl.lambda30();
                case 50:
                    return entrypcl.lambda31();
                case 51:
                    return entrypcl.lambda32();
                case 52:
                    return entrypcl.lambda33();
                case 53:
                    return entrypcl.lambda34();
                case 54:
                    return this.$main.Date_PickerKunjungan$AfterDateSet();
                case 55:
                    return entrypcl.lambda35();
                case 56:
                    return entrypcl.lambda36();
                case 57:
                    return entrypcl.lambda37();
                case 58:
                    return entrypcl.lambda38();
                case 59:
                    return entrypcl.lambda39();
                case 60:
                    return entrypcl.lambda40();
                case 62:
                    return entrypcl.lambda41();
                case 63:
                    return entrypcl.lambda42();
                case 64:
                    return entrypcl.lambda43();
                case 65:
                    return entrypcl.lambda44();
                case 66:
                    return entrypcl.lambda45();
                case 67:
                    return entrypcl.lambda46();
                case 68:
                    return entrypcl.lambda47();
                case 69:
                    return entrypcl.lambda48();
                case 70:
                    return entrypcl.lambda49();
                case 71:
                    return entrypcl.lambda50();
                case 72:
                    return entrypcl.lambda51();
                case 73:
                    return entrypcl.lambda52();
                case 74:
                    return entrypcl.lambda53();
                case 75:
                    return entrypcl.lambda54();
                case 76:
                    return entrypcl.lambda55();
                case 77:
                    return entrypcl.lambda56();
                case 78:
                    return entrypcl.lambda57();
                case 79:
                    return entrypcl.lambda58();
                case 80:
                    return this.$main.ButtonKembali$Click();
                case 81:
                    return entrypcl.lambda59();
                case 82:
                    return entrypcl.lambda60();
                case 83:
                    return entrypcl.lambda61();
                case 84:
                    return entrypcl.lambda62();
                case 85:
                    return entrypcl.lambda63();
                case 86:
                    return entrypcl.lambda64();
                case 87:
                    return this.$main.ButtonSimpan$Click();
                case 88:
                    return entrypcl.lambda65();
                case 89:
                    return entrypcl.lambda66();
                case 90:
                    return entrypcl.lambda67();
                case 91:
                    return entrypcl.lambda68();
                case 94:
                    return entrypcl.lambda70();
                case 95:
                    return entrypcl.lambda71();
                case 96:
                    return this.$main.Clock1$Timer();
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
                case 22:
                case 25:
                case 26:
                case 47:
                case 61:
                case 92:
                case 93:
                default:
                    return super.match0(moduleMethod, callContext);
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
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
                case 65:
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
                case 73:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 74:
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
                case 77:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 78:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 79:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 80:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 81:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 82:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 83:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 84:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 85:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 86:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 87:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 88:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 89:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 90:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 91:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 94:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 95:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 96:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
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
                case 21:
                    return entrypcl.lambda5(obj);
                case 22:
                    return entrypcl.lambda7(obj);
                case 25:
                    return entrypcl.lambda9(obj);
                case 26:
                    return entrypcl.lambda11(obj);
                case 47:
                    return this.$main.List_PickerNus$AfterPicking(obj);
                case 61:
                    return this.$main.List_PickerHasil$AfterPicking(obj);
                case 92:
                    return entrypcl.lambda69proc(obj);
                case 98:
                    return this.$main.Notifier2$AfterChoosing(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }
    }

    static Object lambda55() {
        runtime.setAndCoerceProperty$Ex(Lit191, Lit85, Lit86, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit191, Lit88, Lit89, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit191, Lit94, Lit95, Lit87);
    }

    static Object lambda56() {
        runtime.setAndCoerceProperty$Ex(Lit191, Lit85, Lit86, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit191, Lit88, Lit89, Lit87);
        return runtime.setAndCoerceProperty$Ex(Lit191, Lit94, Lit95, Lit87);
    }

    static Object lambda57() {
        runtime.setAndCoerceProperty$Ex(Lit62, Lit105, Lit194, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit62, Lit98, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit32, "BACK", Lit20);
    }

    static Object lambda58() {
        runtime.setAndCoerceProperty$Ex(Lit62, Lit105, Lit194, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit62, Lit98, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit32, "BACK", Lit20);
    }

    public Object ButtonKembali$Click() {
        runtime.setThisForm();
        return Scheme.applyToArgs.apply2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit16, runtime.$Stthe$Mnnull$Mnvalue$St), "caripcl");
    }

    static Object lambda59() {
        return runtime.setAndCoerceProperty$Ex(Lit199, Lit94, Lit200, Lit87);
    }

    static Object lambda60() {
        return runtime.setAndCoerceProperty$Ex(Lit199, Lit94, Lit200, Lit87);
    }

    static Object lambda61() {
        runtime.setAndCoerceProperty$Ex(Lit66, Lit105, Lit203, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit98, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit32, "SIMPAN", Lit20);
    }

    static Object lambda62() {
        runtime.setAndCoerceProperty$Ex(Lit66, Lit105, Lit203, Lit87);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit98, Boolean.TRUE, Lit25);
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit32, "SIMPAN", Lit20);
    }

    public Object ButtonSimpan$Click() {
        Object callComponentMethod;
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit37, Lit32)), Lit205, "is text empty?") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit206, Lit207, LList.list1("NKS Wajib Isi !!!"), Lit208);
            callComponentMethod = runtime.callComponentMethod(Lit44, Lit209, LList.Empty, LList.Empty);
        } else if (runtime.processOrDelayed$V(new Object[]{lambda$Fn62, lambda$Fn63}) != Boolean.FALSE) {
            callComponentMethod = runtime.callComponentMethod(Lit206, Lit207, LList.list1("Kode Kab/Kota +NKS berjumlah 8 digit  !!!"), Lit214);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit44, Lit32)), Lit215, "is text empty?") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit206, Lit207, LList.list1("Latitude Wajib Isi !!!"), Lit216);
            callComponentMethod = runtime.callComponentMethod(Lit44, Lit209, LList.Empty, LList.Empty);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit47, Lit32)), Lit217, "is text empty?") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit206, Lit207, LList.list1("Longitude Wajib Isi !!!"), Lit218);
            callComponentMethod = runtime.callComponentMethod(Lit47, Lit209, LList.Empty, LList.Empty);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit50, Lit32)), Lit219, "is text empty?") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit206, Lit207, LList.list1("No Urut RUTA Sampel Wajib Isi !!!"), Lit220);
            callComponentMethod = runtime.callComponentMethod(Lit50, Lit209, LList.Empty, LList.Empty);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit53, Lit32)), Lit221, "is text empty?") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit206, Lit207, LList.list1("Tanggal Kunjungan Wajib Isi !!!"), Lit222);
            callComponentMethod = runtime.callComponentMethod(Lit53, Lit209, LList.Empty, LList.Empty);
        } else if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.get$Mnproperty.apply2(Lit56, Lit32)), Lit223, "is text empty?") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit206, Lit207, LList.list1("Hasil Pencacahan Wajib Isi !!!"), Lit224);
            callComponentMethod = runtime.callComponentMethod(Lit56, Lit209, LList.Empty, LList.Empty);
        } else {
            runtime.callComponentMethod(Lit206, Lit225, LList.list2("Sabar Yaaa........", "Sedang Kirim Data!!!"), Lit226);
            runtime.setAndCoerceProperty$Ex(Lit227, Lit228, "https://script.google.com/macros/s/AKfycbwOL8PBs2SLPhrTCe5JAZe5iez3XmV-MgEBBQVunHkvsrxqD1e-e1REIB-acZI7_E_X/exec", Lit20);
            SimpleSymbol simpleSymbol = Lit227;
            SimpleSymbol simpleSymbol2 = Lit229;
            ModuleMethod moduleMethod = strings.string$Mnappend;
            Pair list1 = LList.list1("action=tambah");
            LList.chain1(LList.chain1(LList.chain4(LList.chain4(LList.chain4(LList.chain4(LList.chain4(list1, runtime.callYailPrimitive(strings.string$Mnappend, LList.list4("&idruta=", runtime.get$Mnproperty.apply2(Lit50, Lit32), "   ", runtime.get$Mnproperty.apply2(Lit37, Lit32)), Lit230, "join"), "&nks=", runtime.get$Mnproperty.apply2(Lit37, Lit32), "&alamat="), runtime.get$Mnproperty.apply2(Lit41, Lit32), "&lati=", runtime.get$Mnproperty.apply2(Lit44, Lit32), "&longi="), runtime.get$Mnproperty.apply2(Lit47, Lit32), "&nus=", runtime.get$Mnproperty.apply2(Lit50, Lit32), "&kunjungan="), runtime.get$Mnproperty.apply2(Lit53, Lit32), "&hasil=", runtime.get$Mnproperty.apply2(Lit56, Lit32), "&catatan="), runtime.get$Mnproperty.apply2(Lit59, Lit32), "&mulai=", runtime.get$Mnproperty.apply2(Lit31, Lit32), "&durasi="), runtime.get$Mnproperty.apply2(Lit188, Lit32)), runtime.callYailPrimitive(strings.string$Mnappend, LList.list4("&latilongi=", runtime.get$Mnproperty.apply2(Lit44, Lit32), ",", runtime.get$Mnproperty.apply2(Lit47, Lit32)), Lit231, "join"));
            callComponentMethod = runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod, list1, Lit232, "join")), Lit233);
        }
        return callComponentMethod;
    }

    static Object lambda63() {
        return runtime.callYailPrimitive(Scheme.numGrt, LList.list2(runtime.callYailPrimitive(strings.string$Mnlength, LList.list1(runtime.get$Mnproperty.apply2(Lit37, Lit32)), Lit210, "length"), Lit211), Lit212, ">");
    }

    static Object lambda64() {
        return runtime.callYailPrimitive(Scheme.numLss, LList.list2(runtime.get$Mnproperty.apply2(Lit37, Lit32), Lit211), Lit213, "<");
    }

    static Object lambda65() {
        return runtime.setAndCoerceProperty$Ex(Lit236, Lit94, Lit237, Lit87);
    }

    static Object lambda66() {
        return runtime.setAndCoerceProperty$Ex(Lit236, Lit94, Lit237, Lit87);
    }

    static Object lambda67() {
        return runtime.setAndCoerceProperty$Ex(Lit240, Lit120, Lit241, Lit87);
    }

    static Object lambda68() {
        return runtime.setAndCoerceProperty$Ex(Lit240, Lit120, Lit241, Lit87);
    }

    public Object Location_Sensor1$LocationChanged(Object $latitude, Object $longitude, Object $altitude, Object $speed) {
        Object $latitude2 = runtime.sanitizeComponentData($latitude);
        Object $longitude2 = runtime.sanitizeComponentData($longitude);
        runtime.sanitizeComponentData($altitude);
        runtime.sanitizeComponentData($speed);
        runtime.setThisForm();
        ModuleMethod moduleMethod = proc$Fn68;
        runtime.yailForEach(proc$Fn68, runtime.callComponentMethod(Lit119, Lit249, LList.Empty, LList.Empty));
        runtime.callComponentMethod(Lit119, Lit250, LList.list3($latitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit251), " is not bound in the current context"), "Unbound Variable") : $latitude2, $longitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit252), " is not bound in the current context"), "Unbound Variable") : $longitude2, Lit253), Lit254);
        SimpleSymbol simpleSymbol = Lit119;
        SimpleSymbol simpleSymbol2 = Lit255;
        ModuleMethod moduleMethod2 = strings.string$Mnappend;
        Pair list1 = LList.list1("[");
        LList.chain4(LList.chain4(list1, "{", "lat:", $latitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit251), " is not bound in the current context"), "Unbound Variable") : $latitude2, ","), "lng:", $longitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit252), " is not bound in the current context"), "Unbound Variable") : $longitude2, "}", "]");
        runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod2, list1, Lit256, "join")), Lit257);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit32, runtime.get$Mnproperty.apply2(Lit244, Lit258), Lit20);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit32, $latitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit251), " is not bound in the current context"), "Unbound Variable") : $latitude2, Lit20);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit32, $longitude2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit252), " is not bound in the current context"), "Unbound Variable") : $longitude2, Lit20);
    }

    public static Object lambda69proc(Object $item) {
        return runtime.callComponentMethod(Lit119, Lit246, LList.list1($item instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit247), " is not bound in the current context"), "Unbound Variable") : $item), Lit248);
    }

    static Object lambda70() {
        return runtime.setAndCoerceProperty$Ex(Lit206, Lit105, Lit265, Lit87);
    }

    static Object lambda71() {
        return runtime.setAndCoerceProperty$Ex(Lit206, Lit105, Lit265, Lit87);
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        Object $DURATION = runtime.callComponentMethod(Lit28, Lit269, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.callComponentMethod(Lit28, Lit30, LList.Empty, LList.Empty)), Lit270);
        SimpleSymbol simpleSymbol = Lit188;
        SimpleSymbol simpleSymbol2 = Lit32;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair list1 = LList.list1(Scheme.applyToArgs.apply2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit6, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.callComponentMethod(Lit28, Lit271, LList.list1($DURATION instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit272), " is not bound in the current context"), "Unbound Variable") : $DURATION), Lit273)));
        LList.chain4(list1, "  :  ", Scheme.applyToArgs.apply2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit6, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.callYailPrimitive(DivideOp.modulo, LList.list2(runtime.callComponentMethod(Lit28, Lit274, LList.list1($DURATION instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit272), " is not bound in the current context"), "Unbound Variable") : $DURATION), Lit275), Lit276), Lit277, "modulo")), "  :  ", Scheme.applyToArgs.apply2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit6, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.callYailPrimitive(DivideOp.modulo, LList.list2(runtime.callComponentMethod(Lit28, Lit278, LList.list1($DURATION instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit272), " is not bound in the current context"), "Unbound Variable") : $DURATION), Lit279), Lit276), Lit280, "modulo")));
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, runtime.callYailPrimitive(moduleMethod, list1, Lit281, "join"), Lit20);
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        Object callComponentMethod;
        runtime.sanitizeComponentData($url);
        Object $responseCode2 = runtime.sanitizeComponentData($responseCode);
        runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = runtime.sanitizeComponentData($responseContent);
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($responseCode2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit288), " is not bound in the current context"), "Unbound Variable") : $responseCode2, Lit289), Lit290, "=") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit15, $responseContent2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit291), " is not bound in the current context"), "Unbound Variable") : $responseContent2);
            runtime.callComponentMethod(Lit0, Lit292, LList.Empty, LList.Empty);
            runtime.callComponentMethod(Lit206, Lit293, LList.Empty, LList.Empty);
            SimpleSymbol simpleSymbol = Lit206;
            SimpleSymbol simpleSymbol2 = Lit76;
            Pair list1 = LList.list1($responseContent2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit291), " is not bound in the current context"), "Unbound Variable") : $responseContent2);
            LList.chain4(list1, "Info", "Ok", "", Boolean.FALSE);
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit294);
            callComponentMethod = runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("foto", runtime.callYailPrimitive(strings.string$Mnappend, LList.list3(runtime.get$Mnproperty.apply2(Lit37, Lit32), "##", runtime.get$Mnproperty.apply2(Lit50, Lit32)), Lit295, "join")), Lit296, "open another screen with start value");
        } else {
            callComponentMethod = runtime.callComponentMethod(Lit206, Lit297, LList.list3("Gagal Koneksi, Silahkan Cek Jaringan Anda..... !!!", "Info", "Ok"), Lit298);
        }
        return callComponentMethod;
    }

    public Object Notifier2$AfterChoosing(Object $choice) {
        Object $choice2 = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($choice2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit303), " is not bound in the current context"), "Unbound Variable") : $choice2, "Ya"), Lit304, "=") != Boolean.FALSE ? runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application") : Values.empty;
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
        entrypcl = this;
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
