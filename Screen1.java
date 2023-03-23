package io.kodular.supersugiman.SIMPELSAK22;

import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.MakeroidSideMenuLayout;
import com.google.appinventor.components.runtime.Network;
import com.google.appinventor.components.runtime.Notifier;
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
/* compiled from: Screen1.yail */
/* loaded from: classes.dex */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit12;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit16;
    static final PairWithPosition Lit17;
    static final SimpleSymbol Lit18;
    static final PairWithPosition Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final IntNum Lit21;
    static final PairWithPosition Lit22;
    static final PairWithPosition Lit23;
    static final PairWithPosition Lit24;
    static final PairWithPosition Lit25;
    static final PairWithPosition Lit26;
    static final PairWithPosition Lit27;
    static final PairWithPosition Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final FString Lit31;
    static final SimpleSymbol Lit32;
    static final SimpleSymbol Lit33;
    static final IntNum Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final IntNum Lit38;
    static final FString Lit39;
    static final SimpleSymbol Lit4;
    static final FString Lit40;
    static final SimpleSymbol Lit41;
    static final FString Lit42;
    static final FString Lit43;
    static final SimpleSymbol Lit44;
    static final SimpleSymbol Lit45;
    static final SimpleSymbol Lit46;
    static final SimpleSymbol Lit47;
    static final IntNum Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final SimpleSymbol Lit51;
    static final IntNum Lit52;
    static final FString Lit53;
    static final FString Lit54;
    static final SimpleSymbol Lit55;
    static final IntNum Lit56;
    static final FString Lit57;
    static final FString Lit58;
    static final FString Lit59;
    static final SimpleSymbol Lit6;
    static final SimpleSymbol Lit60;
    static final PairWithPosition Lit61;
    static final SimpleSymbol Lit62;
    static final SimpleSymbol Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final IntNum Lit66;
    static final SimpleSymbol Lit67;
    static final SimpleSymbol Lit68;
    static final FString Lit69;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70;
    static final PairWithPosition Lit71;
    static final PairWithPosition Lit72;
    static final PairWithPosition Lit73;
    static final PairWithPosition Lit74;
    static final PairWithPosition Lit75;
    static final PairWithPosition Lit76;
    static final PairWithPosition Lit77;
    static final SimpleSymbol Lit78;
    static final PairWithPosition Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit9;
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public HorizontalArrangement Horizontal_Arrangement1;
    public HorizontalArrangement Horizontal_Arrangement2;
    public HorizontalArrangement Horizontal_Arrangement3;
    public Label Label1;
    public Network Network1;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public final ModuleMethod Screen1$Initialize;
    public MakeroidSideMenuLayout Side_Menu_Layout1;
    public final ModuleMethod Side_Menu_Layout1$OnMenuItemClick;
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
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    static final SimpleSymbol Lit98 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
    static final SimpleSymbol Lit97 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
    static final SimpleSymbol Lit96 = (SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve();
    static final SimpleSymbol Lit95 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
    static final SimpleSymbol Lit94 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
    static final SimpleSymbol Lit93 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    static final SimpleSymbol Lit92 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
    static final SimpleSymbol Lit91 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
    static final SimpleSymbol Lit90 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
    static final SimpleSymbol Lit89 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
    static final SimpleSymbol Lit88 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
    static final SimpleSymbol Lit87 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
    static final SimpleSymbol Lit86 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
    static final SimpleSymbol Lit85 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
    static final SimpleSymbol Lit84 = (SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve();
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Network");
    static final FString Lit82 = new FString("com.google.appinventor.components.runtime.Network");
    static final SimpleSymbol Lit81 = (SimpleSymbol) new SimpleSymbol("OnMenuItemClick").readResolve();
    static final SimpleSymbol Lit80 = (SimpleSymbol) new SimpleSymbol("Side_Menu_Layout1$OnMenuItemClick").readResolve();

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        SimpleSymbol simpleSymbol2 = Lit4;
        SimpleSymbol simpleSymbol3 = Lit4;
        SimpleSymbol simpleSymbol4 = Lit4;
        SimpleSymbol simpleSymbol5 = (SimpleSymbol) new SimpleSymbol("boolean").readResolve();
        Lit46 = simpleSymbol5;
        Lit79 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 345007), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 345002), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344997), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344992), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344986);
        Lit78 = (SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve();
        Lit77 = PairWithPosition.make(Lit98, PairWithPosition.make(Lit98, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344836), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344831);
        Lit76 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344704);
        Lit75 = PairWithPosition.make(Lit98, PairWithPosition.make(Lit98, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344613), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344608);
        Lit74 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344477);
        Lit73 = PairWithPosition.make(Lit98, PairWithPosition.make(Lit98, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344385), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344380);
        Lit72 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344254);
        Lit71 = PairWithPosition.make(Lit98, PairWithPosition.make(Lit98, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344162), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 344157);
        Lit70 = (SimpleSymbol) new SimpleSymbol("$title").readResolve();
        Lit69 = new FString("com.google.appinventor.components.runtime.MakeroidSideMenuLayout");
        Lit68 = (SimpleSymbol) new SimpleSymbol("HeaderBackgroundImage").readResolve();
        Lit67 = (SimpleSymbol) new SimpleSymbol("CircleHeaderPicture").readResolve();
        Lit66 = IntNum.make(new int[]{Component.COLOR_TEAL});
        Lit65 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit64 = new FString("com.google.appinventor.components.runtime.MakeroidSideMenuLayout");
        Lit63 = (SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve();
        Lit62 = (SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve();
        Lit61 = PairWithPosition.make(Lit98, PairWithPosition.make(Lit98, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 290914), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 290909);
        Lit60 = (SimpleSymbol) new SimpleSymbol("$choice").readResolve();
        Lit59 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit58 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit57 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit56 = IntNum.make(-1070);
        Lit55 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement2").readResolve();
        Lit54 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit53 = new FString("com.google.appinventor.components.runtime.Label");
        Lit52 = IntNum.make(new int[]{Component.COLOR_PURPLE});
        Lit51 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit50 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit49 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit48 = IntNum.make(24);
        Lit47 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit45 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        Lit44 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit43 = new FString("com.google.appinventor.components.runtime.Label");
        Lit42 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit41 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement3").readResolve();
        Lit40 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit39 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit38 = IntNum.make(-2);
        Lit37 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit36 = (SimpleSymbol) new SimpleSymbol("Image").readResolve();
        Lit35 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit34 = IntNum.make(-1020);
        Lit33 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit32 = (SimpleSymbol) new SimpleSymbol("Horizontal_Arrangement1").readResolve();
        Lit31 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit30 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("Screen1$Initialize").readResolve();
        Lit28 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, PairWithPosition.make(Lit46, PairWithPosition.make(Lit46, PairWithPosition.make(Lit35, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75331), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75323), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75315), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75310), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75304);
        Lit27 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75195), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75190), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75184);
        Lit26 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, PairWithPosition.make(Lit46, PairWithPosition.make(Lit46, PairWithPosition.make(Lit35, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75041), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75033), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75025), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75020), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 75014);
        Lit25 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, PairWithPosition.make(Lit46, PairWithPosition.make(Lit46, PairWithPosition.make(Lit35, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74903), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74895), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74887), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74882), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74876);
        Lit24 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, PairWithPosition.make(Lit46, PairWithPosition.make(Lit46, PairWithPosition.make(Lit35, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74767), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74759), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74751), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74746), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74740);
        Lit23 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, PairWithPosition.make(Lit46, PairWithPosition.make(Lit46, PairWithPosition.make(Lit35, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74631), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74623), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74615), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74610), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74604);
        Lit22 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, PairWithPosition.make(Lit46, PairWithPosition.make(Lit46, PairWithPosition.make(Lit35, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74491), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74483), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74475), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74470), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74464);
        Lit21 = IntNum.make(1);
        Lit20 = (SimpleSymbol) new SimpleSymbol("AddItem").readResolve();
        Lit19 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("list").readResolve(), LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74354);
        Lit18 = (SimpleSymbol) new SimpleSymbol("AddMenuItem").readResolve();
        Lit17 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74204), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74199), "/tmp/1643080082012_0.7438949378509779-0/youngandroidproject/../src/io/kodular/supersugiman/SIMPELSAK22/Screen1.yail", 74193);
        Lit16 = (SimpleSymbol) new SimpleSymbol("ShowMessageDialog").readResolve();
        Lit15 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("HeaderPicture").readResolve();
        Lit13 = (SimpleSymbol) new SimpleSymbol("HeaderSubtitle").readResolve();
        Lit12 = (SimpleSymbol) new SimpleSymbol("HeaderTitle").readResolve();
        Lit11 = (SimpleSymbol) new SimpleSymbol("Side_Menu_Layout1").readResolve();
        Lit10 = (SimpleSymbol) new SimpleSymbol("IsConnected").readResolve();
        Lit9 = (SimpleSymbol) new SimpleSymbol("Network1").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("ReceiveSharedText").readResolve();
        Lit6 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("AppId").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("AboutScreenTitle").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Screen1").readResolve();
    }

    public Screen1() {
        ModuleInfo.register(this);
        frame frameVar = new frame();
        frameVar.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frameVar, 1, Lit84, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frameVar, 2, Lit85, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frameVar, 3, Lit86, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 4, Lit87, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frameVar, 6, Lit88, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frameVar, 7, Lit89, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frameVar, 8, Lit90, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frameVar, 9, Lit91, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frameVar, 10, Lit92, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frameVar, 11, Lit93, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frameVar, 12, Lit94, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frameVar, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frameVar, 14, Lit95, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frameVar, 15, Lit96, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frameVar, 16, Lit97, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frameVar, 17, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6458243650290595638.scm:615");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frameVar, 18, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frameVar, 19, null, 0);
        this.Screen1$Initialize = new ModuleMethod(frameVar, 20, Lit29, 0);
        lambda$Fn3 = new ModuleMethod(frameVar, 21, null, 0);
        lambda$Fn4 = new ModuleMethod(frameVar, 22, null, 0);
        lambda$Fn5 = new ModuleMethod(frameVar, 23, null, 0);
        lambda$Fn6 = new ModuleMethod(frameVar, 24, null, 0);
        lambda$Fn7 = new ModuleMethod(frameVar, 25, null, 0);
        lambda$Fn8 = new ModuleMethod(frameVar, 26, null, 0);
        lambda$Fn9 = new ModuleMethod(frameVar, 27, null, 0);
        lambda$Fn10 = new ModuleMethod(frameVar, 28, null, 0);
        this.Notifier1$AfterChoosing = new ModuleMethod(frameVar, 29, Lit62, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn11 = new ModuleMethod(frameVar, 30, null, 0);
        lambda$Fn12 = new ModuleMethod(frameVar, 31, null, 0);
        this.Side_Menu_Layout1$OnMenuItemClick = new ModuleMethod(frameVar, 32, Lit80, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
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
        Screen1 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "SIMPEL SAKERNAS", Lit4);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "5510172111798272", Lit4);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "SIMPELSAK22", Lit4);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit7, AlgorithmIdentifiers.NONE, Lit4);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "SIMPEL SAKERNAS FEB 2022", Lit4), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit29, this.Screen1$Initialize);
        } else {
            addToFormEnvironment(Lit29, this.Screen1$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
        } else {
            addToEvents(Lit0, Lit30);
        }
        this.Horizontal_Arrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit31, Lit32, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit39, Lit32, lambda$Fn4);
        }
        this.Horizontal_Arrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit40, Lit41, lambda$Fn5), $result);
        } else {
            addToComponents(Lit0, Lit42, Lit41, lambda$Fn6);
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit43, Lit44, lambda$Fn7), $result);
        } else {
            addToComponents(Lit41, Lit53, Lit44, lambda$Fn8);
        }
        this.Horizontal_Arrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit54, Lit55, lambda$Fn9), $result);
        } else {
            addToComponents(Lit0, Lit57, Lit55, lambda$Fn10);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit58, Lit15, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit59, Lit15, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit62, this.Notifier1$AfterChoosing);
        } else {
            addToFormEnvironment(Lit62, this.Notifier1$AfterChoosing);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
        } else {
            addToEvents(Lit15, Lit63);
        }
        this.Side_Menu_Layout1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit64, Lit11, lambda$Fn11), $result);
        } else {
            addToComponents(Lit0, Lit69, Lit11, lambda$Fn12);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit80, this.Side_Menu_Layout1$OnMenuItemClick);
        } else {
            addToFormEnvironment(Lit80, this.Side_Menu_Layout1$OnMenuItemClick);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Side_Menu_Layout1", "OnMenuItemClick");
        } else {
            addToEvents(Lit11, Lit81);
        }
        this.Network1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit82, Lit9, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit83, Lit9, Boolean.FALSE);
        }
        runtime.initRuntime();
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "SIMPEL SAKERNAS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "5510172111798272", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "SIMPELSAK22", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit7, AlgorithmIdentifiers.NONE, Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "SIMPEL SAKERNAS FEB 2022", Lit4);
    }

    public Object Screen1$Initialize() {
        Object callComponentMethod;
        runtime.setThisForm();
        if (runtime.callComponentMethod(Lit9, Lit10, LList.Empty, LList.Empty) != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit11, Lit12, "SIMPEL SURVEI SAKERNAS", Lit4);
            runtime.setAndCoerceProperty$Ex(Lit11, Lit13, "Sakernas Februari 2022", Lit4);
            runtime.setAndCoerceProperty$Ex(Lit11, Lit14, "sak.jpg", Lit4);
            runtime.callComponentMethod(Lit15, Lit16, LList.list3("Ada Jaringan Internet !!!!", "Info", "OK"), Lit17);
            runtime.callComponentMethod(Lit0, Lit18, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), Lit19);
            SimpleSymbol simpleSymbol = Lit11;
            SimpleSymbol simpleSymbol2 = Lit20;
            Pair list1 = LList.list1("Home");
            LList.chain4(list1, "home.png", Boolean.TRUE, Boolean.TRUE, Lit21);
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit22);
            SimpleSymbol simpleSymbol3 = Lit11;
            SimpleSymbol simpleSymbol4 = Lit20;
            Pair list12 = LList.list1("UPDATING");
            LList.chain4(list12, "up.png", Boolean.TRUE, Boolean.TRUE, Lit21);
            runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, list12, Lit23);
            SimpleSymbol simpleSymbol5 = Lit11;
            SimpleSymbol simpleSymbol6 = Lit20;
            Pair list13 = LList.list1("PCL");
            LList.chain4(list13, "pcl.png", Boolean.TRUE, Boolean.TRUE, Lit21);
            runtime.callComponentMethod(simpleSymbol5, simpleSymbol6, list13, Lit24);
            SimpleSymbol simpleSymbol7 = Lit11;
            SimpleSymbol simpleSymbol8 = Lit20;
            Pair list14 = LList.list1("PML");
            LList.chain4(list14, "pml.png", Boolean.TRUE, Boolean.TRUE, Lit21);
            runtime.callComponentMethod(simpleSymbol7, simpleSymbol8, list14, Lit25);
            SimpleSymbol simpleSymbol9 = Lit11;
            SimpleSymbol simpleSymbol10 = Lit20;
            Pair list15 = LList.list1("EXIT");
            LList.chain4(list15, "exit.png", Boolean.TRUE, Boolean.TRUE, Lit21);
            callComponentMethod = runtime.callComponentMethod(simpleSymbol9, simpleSymbol10, list15, Lit26);
        } else {
            runtime.callComponentMethod(Lit15, Lit16, LList.list3("Tidak Ada Jaringan Internet !!!!", "Info", "OK"), Lit27);
            SimpleSymbol simpleSymbol11 = Lit11;
            SimpleSymbol simpleSymbol12 = Lit20;
            Pair list16 = LList.list1("EXIT");
            LList.chain4(list16, "exit.png", Boolean.TRUE, Boolean.TRUE, Lit21);
            callComponentMethod = runtime.callComponentMethod(simpleSymbol11, simpleSymbol12, list16, Lit28);
        }
        return callComponentMethod;
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Lit34, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit32, Lit36, "BPS_RIAU.jpg", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit32, Lit37, Lit38, Lit35);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Lit34, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit32, Lit36, "BPS_RIAU.jpg", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit32, Lit37, Lit38, Lit35);
    }

    static Object lambda6() {
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit37, Lit38, Lit35);
    }

    static Object lambda7() {
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit37, Lit38, Lit35);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit45, Boolean.TRUE, Lit46);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit47, Lit48, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit49, "SURVEI SAKERNAS FEBRUARI 2022", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit50, Lit21, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit51, Lit52, Lit35);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit37, Lit38, Lit35);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit45, Boolean.TRUE, Lit46);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit47, Lit48, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit49, "SURVEI SAKERNAS FEBRUARI 2022", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit50, Lit21, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit51, Lit52, Lit35);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit37, Lit38, Lit35);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit55, Lit33, Lit56, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit36, "sak.jpg", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit37, Lit38, Lit35);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit55, Lit33, Lit56, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit36, "sak.jpg", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit37, Lit38, Lit35);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object $choice2 = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($choice2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit60), " is not bound in the current context"), "Unbound Variable") : $choice2, "Ya"), Lit61, "=") != Boolean.FALSE ? runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application") : Values.empty;
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit65, Lit66, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit67, Boolean.TRUE, Lit46);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit68, "gradient-speed-motion-background.jpg", Lit4);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit65, Lit66, Lit35);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit67, Boolean.TRUE, Lit46);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit68, "gradient-speed-motion-background.jpg", Lit4);
    }

    public Object Side_Menu_Layout1$OnMenuItemClick(Object $title) {
        Object obj;
        Object $title2 = runtime.sanitizeComponentData($title);
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($title2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit70), " is not bound in the current context"), "Unbound Variable") : $title2, "PCL"), Lit71, "=") != Boolean.FALSE) {
            obj = runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("caripcl"), Lit72, "open another screen");
        } else {
            if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($title2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit70), " is not bound in the current context"), "Unbound Variable") : $title2, "PML"), Lit73, "=") != Boolean.FALSE) {
                obj = runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("caripml"), Lit74, "open another screen");
            } else {
                if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($title2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit70), " is not bound in the current context"), "Unbound Variable") : $title2, "UPDATING"), Lit75, "=") != Boolean.FALSE) {
                    obj = runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("update"), Lit76, "open another screen");
                } else {
                    if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($title2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit70), " is not bound in the current context"), "Unbound Variable") : $title2, "EXIT"), Lit77, "=") != Boolean.FALSE) {
                        SimpleSymbol simpleSymbol = Lit15;
                        SimpleSymbol simpleSymbol2 = Lit78;
                        Pair list1 = LList.list1("Anda Yakin Akan Keluar");
                        LList.chain4(list1, "Yakin !!!", "Ya", "Tidak", Boolean.FALSE);
                        obj = runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit79);
                    } else {
                        obj = Values.empty;
                    }
                }
            }
        }
        return obj;
    }

    /* compiled from: Screen1.yail */
    /* loaded from: classes.dex */
    public class frame extends ModuleBody {
        Screen1 $main;

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
                    if (obj instanceof Screen1) {
                        callContext.value1 = obj;
                        callContext.proc = moduleMethod;
                        callContext.pc = 1;
                        return 0;
                    }
                    return -786431;
                case 29:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 32:
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
                    if (obj instanceof Screen1) {
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
                    if (obj instanceof Screen1) {
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
                case 29:
                    return this.$main.Notifier1$AfterChoosing(obj);
                case 32:
                    return this.$main.Side_Menu_Layout1$OnMenuItemClick(obj);
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
                    return Screen1.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen1.lambda3();
                case 20:
                    return this.$main.Screen1$Initialize();
                case 21:
                    return Screen1.lambda4();
                case 22:
                    return Screen1.lambda5();
                case 23:
                    return Screen1.lambda6();
                case 24:
                    return Screen1.lambda7();
                case 25:
                    return Screen1.lambda8();
                case 26:
                    return Screen1.lambda9();
                case 27:
                    return Screen1.lambda10();
                case 28:
                    return Screen1.lambda11();
                case 29:
                default:
                    return super.apply0(moduleMethod);
                case 30:
                    return Screen1.lambda12();
                case 31:
                    return Screen1.lambda13();
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
                default:
                    return super.match0(moduleMethod, callContext);
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
            }
        }
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
        Screen1 = this;
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
