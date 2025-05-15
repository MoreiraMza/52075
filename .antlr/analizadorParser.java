// Generated from c:/Users/faust/Downloads/52075/analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class analizadorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, LETRA=19, DIGITO=20, SIMBOLO=21, WS=22;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_bucle = 3, 
		RULE_inicializacion = 4, RULE_condicion = 5, RULE_actualizacion = 6, RULE_operador_relacional = 7, 
		RULE_operador_incremento = 8, RULE_sentencia = 9, RULE_salida = 10, RULE_terminar = 11, 
		RULE_identificador = 12, RULE_numero = 13, RULE_cadena = 14, RULE_caracteres = 15, 
		RULE_caracter = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "bucle", "inicializacion", 
			"condicion", "actualizacion", "operador_relacional", "operador_incremento", 
			"sentencia", "salida", "terminar", "identificador", "numero", "cadena", 
			"caracteres", "caracter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'('", "';'", "')'", "'{'", "'}'", "'='", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'++'", "'--'", "'printf'", "'break'", 
			"'\\u0022'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "LETRA", "DIGITO", "SIMBOLO", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "analizador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public analizadorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			instrucciones(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		return instrucciones(0);
	}

	private InstruccionesContext instrucciones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, _parentState);
		InstruccionesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_instrucciones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(37);
			instruccion();
			}
			_ctx.stop = _input.LT(-1);
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstruccionesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instrucciones);
					setState(39);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(40);
					instruccion();
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public BucleContext bucle() {
			return getRuleContext(BucleContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			bucle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucleContext extends ParserRuleContext {
		public InicializacionContext inicializacion() {
			return getRuleContext(InicializacionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ActualizacionContext actualizacion() {
			return getRuleContext(ActualizacionContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitBucle(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			match(T__1);
			setState(50);
			inicializacion();
			setState(51);
			match(T__2);
			setState(52);
			condicion();
			setState(53);
			match(T__2);
			setState(54);
			actualizacion();
			setState(55);
			match(T__3);
			setState(56);
			match(T__4);
			setState(57);
			sentencia();
			setState(58);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicializacionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public InicializacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterInicializacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitInicializacion(this);
		}
	}

	public final InicializacionContext inicializacion() throws RecognitionException {
		InicializacionContext _localctx = new InicializacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inicializacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			identificador();
			setState(61);
			match(T__6);
			setState(62);
			numero();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			identificador();
			setState(65);
			operador_relacional();
			setState(66);
			numero();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualizacionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Operador_incrementoContext operador_incremento() {
			return getRuleContext(Operador_incrementoContext.class,0);
		}
		public ActualizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterActualizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitActualizacion(this);
		}
	}

	public final ActualizacionContext actualizacion() throws RecognitionException {
		ActualizacionContext _localctx = new ActualizacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_actualizacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			identificador();
			setState(69);
			operador_incremento();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_relacionalContext extends ParserRuleContext {
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitOperador_relacional(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_incrementoContext extends ParserRuleContext {
		public Operador_incrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterOperador_incremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitOperador_incremento(this);
		}
	}

	public final Operador_incrementoContext operador_incremento() throws RecognitionException {
		Operador_incrementoContext _localctx = new Operador_incrementoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operador_incremento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public SalidaContext salida() {
			return getRuleContext(SalidaContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminarContext terminar() {
			return getRuleContext(TerminarContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentencia);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				salida();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				salida();
				setState(77);
				sentencia();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				terminar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SalidaContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public SalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterSalida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitSalida(this);
		}
	}

	public final SalidaContext salida() throws RecognitionException {
		SalidaContext _localctx = new SalidaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_salida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__15);
			setState(83);
			match(T__1);
			setState(84);
			cadena();
			setState(85);
			match(T__3);
			setState(86);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminarContext extends ParserRuleContext {
		public TerminarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterTerminar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitTerminar(this);
		}
	}

	public final TerminarContext terminar() throws RecognitionException {
		TerminarContext _localctx = new TerminarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_terminar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__16);
			setState(89);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(analizadorParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(analizadorParser.LETRA, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(analizadorParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(analizadorParser.DIGITO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(LETRA);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETRA || _la==DIGITO) {
				{
				{
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==LETRA || _la==DIGITO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(analizadorParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(analizadorParser.DIGITO, i);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				match(DIGITO);
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CadenaContext extends ParserRuleContext {
		public CaracteresContext caracteres() {
			return getRuleContext(CaracteresContext.class,0);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitCadena(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__17);
			setState(104);
			caracteres(0);
			setState(105);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaracteresContext extends ParserRuleContext {
		public CaracterContext caracter() {
			return getRuleContext(CaracterContext.class,0);
		}
		public CaracteresContext caracteres() {
			return getRuleContext(CaracteresContext.class,0);
		}
		public CaracteresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracteres; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterCaracteres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitCaracteres(this);
		}
	}

	public final CaracteresContext caracteres() throws RecognitionException {
		return caracteres(0);
	}

	private CaracteresContext caracteres(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CaracteresContext _localctx = new CaracteresContext(_ctx, _parentState);
		CaracteresContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_caracteres, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(108);
			caracter();
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CaracteresContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_caracteres);
					setState(110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(111);
					caracter();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaracterContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(analizadorParser.LETRA, 0); }
		public TerminalNode DIGITO() { return getToken(analizadorParser.DIGITO, 0); }
		public TerminalNode SIMBOLO() { return getToken(analizadorParser.SIMBOLO, 0); }
		public CaracterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).enterCaracter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof analizadorListener ) ((analizadorListener)listener).exitCaracter(this);
		}
	}

	public final CaracterContext caracter() throws RecognitionException {
		CaracterContext _localctx = new CaracterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caracter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return instrucciones_sempred((InstruccionesContext)_localctx, predIndex);
		case 15:
			return caracteres_sempred((CaracteresContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean instrucciones_sempred(InstruccionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean caracteres_sempred(CaracteresContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016x\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001*\b\u0001\n\u0001\f\u0001"+
		"-\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tQ\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0005\f^\b\f\n\f\f\fa\t\f\u0001\r\u0004\rd\b\r\u000b\r\f\re\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000fq\b\u000f\n\u000f\f\u000ft\t"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0002\u0002\u001e\u0011"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \u0000\u0004\u0001\u0000\b\r\u0001\u0000\u000e\u000f\u0001"+
		"\u0000\u0013\u0014\u0001\u0000\u0013\u0015l\u0000\"\u0001\u0000\u0000"+
		"\u0000\u0002$\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u0006"+
		"0\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000"+
		"\u0000\fD\u0001\u0000\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010"+
		"I\u0001\u0000\u0000\u0000\u0012P\u0001\u0000\u0000\u0000\u0014R\u0001"+
		"\u0000\u0000\u0000\u0016X\u0001\u0000\u0000\u0000\u0018[\u0001\u0000\u0000"+
		"\u0000\u001ac\u0001\u0000\u0000\u0000\u001cg\u0001\u0000\u0000\u0000\u001e"+
		"k\u0001\u0000\u0000\u0000 u\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001"+
		"\u0000#\u0001\u0001\u0000\u0000\u0000$%\u0006\u0001\uffff\uffff\u0000"+
		"%&\u0003\u0004\u0002\u0000&+\u0001\u0000\u0000\u0000\'(\n\u0001\u0000"+
		"\u0000(*\u0003\u0004\u0002\u0000)\'\u0001\u0000\u0000\u0000*-\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0003"+
		"\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0003\u0006\u0003"+
		"\u0000/\u0005\u0001\u0000\u0000\u000001\u0005\u0001\u0000\u000012\u0005"+
		"\u0002\u0000\u000023\u0003\b\u0004\u000034\u0005\u0003\u0000\u000045\u0003"+
		"\n\u0005\u000056\u0005\u0003\u0000\u000067\u0003\f\u0006\u000078\u0005"+
		"\u0004\u0000\u000089\u0005\u0005\u0000\u00009:\u0003\u0012\t\u0000:;\u0005"+
		"\u0006\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0003\u0018\f\u0000"+
		"=>\u0005\u0007\u0000\u0000>?\u0003\u001a\r\u0000?\t\u0001\u0000\u0000"+
		"\u0000@A\u0003\u0018\f\u0000AB\u0003\u000e\u0007\u0000BC\u0003\u001a\r"+
		"\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0003\u0018\f\u0000EF\u0003\u0010"+
		"\b\u0000F\r\u0001\u0000\u0000\u0000GH\u0007\u0000\u0000\u0000H\u000f\u0001"+
		"\u0000\u0000\u0000IJ\u0007\u0001\u0000\u0000J\u0011\u0001\u0000\u0000"+
		"\u0000KQ\u0003\u0014\n\u0000LM\u0003\u0014\n\u0000MN\u0003\u0012\t\u0000"+
		"NQ\u0001\u0000\u0000\u0000OQ\u0003\u0016\u000b\u0000PK\u0001\u0000\u0000"+
		"\u0000PL\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0013\u0001"+
		"\u0000\u0000\u0000RS\u0005\u0010\u0000\u0000ST\u0005\u0002\u0000\u0000"+
		"TU\u0003\u001c\u000e\u0000UV\u0005\u0004\u0000\u0000VW\u0005\u0003\u0000"+
		"\u0000W\u0015\u0001\u0000\u0000\u0000XY\u0005\u0011\u0000\u0000YZ\u0005"+
		"\u0003\u0000\u0000Z\u0017\u0001\u0000\u0000\u0000[_\u0005\u0013\u0000"+
		"\u0000\\^\u0007\u0002\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0019"+
		"\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bd\u0005\u0014\u0000"+
		"\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000f\u001b\u0001\u0000\u0000\u0000"+
		"gh\u0005\u0012\u0000\u0000hi\u0003\u001e\u000f\u0000ij\u0005\u0012\u0000"+
		"\u0000j\u001d\u0001\u0000\u0000\u0000kl\u0006\u000f\uffff\uffff\u0000"+
		"lm\u0003 \u0010\u0000mr\u0001\u0000\u0000\u0000no\n\u0001\u0000\u0000"+
		"oq\u0003 \u0010\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u001f\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0007\u0003\u0000\u0000v!\u0001"+
		"\u0000\u0000\u0000\u0005+P_er";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}