// Generated from c:/Users/faust/Downloads/52075/analizador.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import analizadorListener from './analizadorListener.js';
import analizadorVisitor from './analizadorVisitor.js';

const serializedATN = [4,1,22,115,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
2,13,7,13,2,14,7,14,1,0,1,0,1,0,1,0,1,0,5,0,36,8,0,10,0,12,0,39,9,0,1,1,
1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,4,3,58,8,
3,11,3,12,3,59,1,4,1,4,1,4,4,4,65,8,4,11,4,12,4,66,1,5,1,5,1,5,1,6,1,6,1,
7,1,7,1,8,1,8,1,8,1,8,1,8,3,8,81,8,8,1,9,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,
10,1,11,1,11,5,11,94,8,11,10,11,12,11,97,9,11,1,12,1,12,1,12,1,12,1,13,1,
13,1,13,1,13,1,13,5,13,108,8,13,10,13,12,13,111,9,13,1,14,1,14,1,14,0,2,
0,26,15,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,0,4,1,0,8,13,1,0,14,15,1,
0,19,20,1,0,19,21,106,0,30,1,0,0,0,2,40,1,0,0,0,4,42,1,0,0,0,6,54,1,0,0,
0,8,61,1,0,0,0,10,68,1,0,0,0,12,71,1,0,0,0,14,73,1,0,0,0,16,80,1,0,0,0,18,
82,1,0,0,0,20,88,1,0,0,0,22,91,1,0,0,0,24,98,1,0,0,0,26,102,1,0,0,0,28,112,
1,0,0,0,30,31,6,0,-1,0,31,32,3,2,1,0,32,37,1,0,0,0,33,34,10,1,0,0,34,36,
3,2,1,0,35,33,1,0,0,0,36,39,1,0,0,0,37,35,1,0,0,0,37,38,1,0,0,0,38,1,1,0,
0,0,39,37,1,0,0,0,40,41,3,4,2,0,41,3,1,0,0,0,42,43,5,1,0,0,43,44,5,2,0,0,
44,45,3,6,3,0,45,46,5,4,0,0,46,47,3,8,4,0,47,48,5,4,0,0,48,49,3,10,5,0,49,
50,5,3,0,0,50,51,5,5,0,0,51,52,3,16,8,0,52,53,5,6,0,0,53,5,1,0,0,0,54,55,
3,22,11,0,55,57,5,7,0,0,56,58,5,20,0,0,57,56,1,0,0,0,58,59,1,0,0,0,59,57,
1,0,0,0,59,60,1,0,0,0,60,7,1,0,0,0,61,62,3,22,11,0,62,64,3,12,6,0,63,65,
5,20,0,0,64,63,1,0,0,0,65,66,1,0,0,0,66,64,1,0,0,0,66,67,1,0,0,0,67,9,1,
0,0,0,68,69,3,22,11,0,69,70,3,14,7,0,70,11,1,0,0,0,71,72,7,0,0,0,72,13,1,
0,0,0,73,74,7,1,0,0,74,15,1,0,0,0,75,81,3,18,9,0,76,77,3,18,9,0,77,78,3,
16,8,0,78,81,1,0,0,0,79,81,3,20,10,0,80,75,1,0,0,0,80,76,1,0,0,0,80,79,1,
0,0,0,81,17,1,0,0,0,82,83,5,16,0,0,83,84,5,2,0,0,84,85,3,24,12,0,85,86,5,
3,0,0,86,87,5,4,0,0,87,19,1,0,0,0,88,89,5,17,0,0,89,90,5,4,0,0,90,21,1,0,
0,0,91,95,5,19,0,0,92,94,7,2,0,0,93,92,1,0,0,0,94,97,1,0,0,0,95,93,1,0,0,
0,95,96,1,0,0,0,96,23,1,0,0,0,97,95,1,0,0,0,98,99,5,18,0,0,99,100,3,26,13,
0,100,101,5,18,0,0,101,25,1,0,0,0,102,103,6,13,-1,0,103,104,3,28,14,0,104,
109,1,0,0,0,105,106,10,1,0,0,106,108,3,28,14,0,107,105,1,0,0,0,108,111,1,
0,0,0,109,107,1,0,0,0,109,110,1,0,0,0,110,27,1,0,0,0,111,109,1,0,0,0,112,
113,7,3,0,0,113,29,1,0,0,0,6,37,59,66,80,95,109];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class analizadorParser extends antlr4.Parser {

    static grammarFileName = "analizador.g4";
    static literalNames = [ null, "'for'", "'('", "')'", "';'", "'{'", "'}'", 
                            "'='", "'<'", "'<='", "'>'", "'>='", "'=='", 
                            "'!='", "'++'", "'--'", "'printf'", "'break'", 
                            "'\\u0022'" ];
    static symbolicNames = [ null, "FOR", "PARENTESISI", "PARENTESISD", 
                             "DOS", "CORCHETEI", "CORCHETED", "IGUAL", "PACMANI", 
                             "PACMANIIGUAL", "PACMAND", "PACMANDIGUAL", 
                             "IGUALIGUAL", "TRES", "MASMAS", "GUIONGUION", 
                             "IMPRIMIR", "BO", "BACK", "LETRA", "DIGITO", 
                             "SIMBOLO", "WS" ];
    static ruleNames = [ "instrucciones", "instruccion", "bucle", "inicializacion", 
                         "condicion", "actualizacion", "operador_relacional", 
                         "operador_incremento", "sentencia", "salida", "terminar", 
                         "identificador", "cadena", "caracteres", "caracter" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = analizadorParser.ruleNames;
        this.literalNames = analizadorParser.literalNames;
        this.symbolicNames = analizadorParser.symbolicNames;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 0:
    	    		return this.instrucciones_sempred(localctx, predIndex);
    	case 13:
    	    		return this.caracteres_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    instrucciones_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 1);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };

    caracteres_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 1:
    			return this.precpred(this._ctx, 1);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };



	instrucciones(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new InstruccionesContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 0;
	    this.enterRecursionRule(localctx, 0, analizadorParser.RULE_instrucciones, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 31;
	        this.instruccion();
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 37;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,0,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                localctx = new InstruccionesContext(this, _parentctx, _parentState);
	                this.pushNewRecursionContext(localctx, _startState, analizadorParser.RULE_instrucciones);
	                this.state = 33;
	                if (!( this.precpred(this._ctx, 1))) {
	                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 1)");
	                }
	                this.state = 34;
	                this.instruccion(); 
	            }
	            this.state = 39;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,0,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	instruccion() {
	    let localctx = new InstruccionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, analizadorParser.RULE_instruccion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 40;
	        this.bucle();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	bucle() {
	    let localctx = new BucleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, analizadorParser.RULE_bucle);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 42;
	        this.match(analizadorParser.FOR);
	        this.state = 43;
	        this.match(analizadorParser.PARENTESISI);
	        this.state = 44;
	        this.inicializacion();
	        this.state = 45;
	        this.match(analizadorParser.DOS);
	        this.state = 46;
	        this.condicion();
	        this.state = 47;
	        this.match(analizadorParser.DOS);
	        this.state = 48;
	        this.actualizacion();
	        this.state = 49;
	        this.match(analizadorParser.PARENTESISD);
	        this.state = 50;
	        this.match(analizadorParser.CORCHETEI);
	        this.state = 51;
	        this.sentencia();
	        this.state = 52;
	        this.match(analizadorParser.CORCHETED);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	inicializacion() {
	    let localctx = new InicializacionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, analizadorParser.RULE_inicializacion);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 54;
	        this.identificador();
	        this.state = 55;
	        this.match(analizadorParser.IGUAL);
	        this.state = 57; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 56;
	            this.match(analizadorParser.DIGITO);
	            this.state = 59; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===20);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condicion() {
	    let localctx = new CondicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, analizadorParser.RULE_condicion);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 61;
	        this.identificador();
	        this.state = 62;
	        this.operador_relacional();
	        this.state = 64; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 63;
	            this.match(analizadorParser.DIGITO);
	            this.state = 66; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===20);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	actualizacion() {
	    let localctx = new ActualizacionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, analizadorParser.RULE_actualizacion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 68;
	        this.identificador();
	        this.state = 69;
	        this.operador_incremento();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	operador_relacional() {
	    let localctx = new Operador_relacionalContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, analizadorParser.RULE_operador_relacional);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 71;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 16128) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	operador_incremento() {
	    let localctx = new Operador_incrementoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, analizadorParser.RULE_operador_incremento);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 73;
	        _la = this._input.LA(1);
	        if(!(_la===14 || _la===15)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	sentencia() {
	    let localctx = new SentenciaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, analizadorParser.RULE_sentencia);
	    try {
	        this.state = 80;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,3,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 75;
	            this.salida();
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 76;
	            this.salida();
	            this.state = 77;
	            this.sentencia();
	            break;

	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 79;
	            this.terminar();
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	salida() {
	    let localctx = new SalidaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, analizadorParser.RULE_salida);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 82;
	        this.match(analizadorParser.IMPRIMIR);
	        this.state = 83;
	        this.match(analizadorParser.PARENTESISI);
	        this.state = 84;
	        this.cadena();
	        this.state = 85;
	        this.match(analizadorParser.PARENTESISD);
	        this.state = 86;
	        this.match(analizadorParser.DOS);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	terminar() {
	    let localctx = new TerminarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, analizadorParser.RULE_terminar);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 88;
	        this.match(analizadorParser.BO);
	        this.state = 89;
	        this.match(analizadorParser.DOS);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	identificador() {
	    let localctx = new IdentificadorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, analizadorParser.RULE_identificador);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 91;
	        this.match(analizadorParser.LETRA);
	        this.state = 95;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===19 || _la===20) {
	            this.state = 92;
	            _la = this._input.LA(1);
	            if(!(_la===19 || _la===20)) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 97;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	cadena() {
	    let localctx = new CadenaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, analizadorParser.RULE_cadena);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 98;
	        this.match(analizadorParser.BACK);
	        this.state = 99;
	        this.caracteres(0);
	        this.state = 100;
	        this.match(analizadorParser.BACK);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


	caracteres(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new CaracteresContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 26;
	    this.enterRecursionRule(localctx, 26, analizadorParser.RULE_caracteres, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 103;
	        this.caracter();
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 109;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,5,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                localctx = new CaracteresContext(this, _parentctx, _parentState);
	                this.pushNewRecursionContext(localctx, _startState, analizadorParser.RULE_caracteres);
	                this.state = 105;
	                if (!( this.precpred(this._ctx, 1))) {
	                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 1)");
	                }
	                this.state = 106;
	                this.caracter(); 
	            }
	            this.state = 111;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,5,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	caracter() {
	    let localctx = new CaracterContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 28, analizadorParser.RULE_caracter);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 112;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 3670016) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

analizadorParser.EOF = antlr4.Token.EOF;
analizadorParser.FOR = 1;
analizadorParser.PARENTESISI = 2;
analizadorParser.PARENTESISD = 3;
analizadorParser.DOS = 4;
analizadorParser.CORCHETEI = 5;
analizadorParser.CORCHETED = 6;
analizadorParser.IGUAL = 7;
analizadorParser.PACMANI = 8;
analizadorParser.PACMANIIGUAL = 9;
analizadorParser.PACMAND = 10;
analizadorParser.PACMANDIGUAL = 11;
analizadorParser.IGUALIGUAL = 12;
analizadorParser.TRES = 13;
analizadorParser.MASMAS = 14;
analizadorParser.GUIONGUION = 15;
analizadorParser.IMPRIMIR = 16;
analizadorParser.BO = 17;
analizadorParser.BACK = 18;
analizadorParser.LETRA = 19;
analizadorParser.DIGITO = 20;
analizadorParser.SIMBOLO = 21;
analizadorParser.WS = 22;

analizadorParser.RULE_instrucciones = 0;
analizadorParser.RULE_instruccion = 1;
analizadorParser.RULE_bucle = 2;
analizadorParser.RULE_inicializacion = 3;
analizadorParser.RULE_condicion = 4;
analizadorParser.RULE_actualizacion = 5;
analizadorParser.RULE_operador_relacional = 6;
analizadorParser.RULE_operador_incremento = 7;
analizadorParser.RULE_sentencia = 8;
analizadorParser.RULE_salida = 9;
analizadorParser.RULE_terminar = 10;
analizadorParser.RULE_identificador = 11;
analizadorParser.RULE_cadena = 12;
analizadorParser.RULE_caracteres = 13;
analizadorParser.RULE_caracter = 14;

class InstruccionesContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_instrucciones;
    }

	instruccion() {
	    return this.getTypedRuleContext(InstruccionContext,0);
	};

	instrucciones() {
	    return this.getTypedRuleContext(InstruccionesContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterInstrucciones(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitInstrucciones(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitInstrucciones(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_instruccion;
    }

	bucle() {
	    return this.getTypedRuleContext(BucleContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterInstruccion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitInstruccion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitInstruccion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class BucleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_bucle;
    }

	FOR() {
	    return this.getToken(analizadorParser.FOR, 0);
	};

	PARENTESISI() {
	    return this.getToken(analizadorParser.PARENTESISI, 0);
	};

	inicializacion() {
	    return this.getTypedRuleContext(InicializacionContext,0);
	};

	DOS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(analizadorParser.DOS);
	    } else {
	        return this.getToken(analizadorParser.DOS, i);
	    }
	};


	condicion() {
	    return this.getTypedRuleContext(CondicionContext,0);
	};

	actualizacion() {
	    return this.getTypedRuleContext(ActualizacionContext,0);
	};

	PARENTESISD() {
	    return this.getToken(analizadorParser.PARENTESISD, 0);
	};

	CORCHETEI() {
	    return this.getToken(analizadorParser.CORCHETEI, 0);
	};

	sentencia() {
	    return this.getTypedRuleContext(SentenciaContext,0);
	};

	CORCHETED() {
	    return this.getToken(analizadorParser.CORCHETED, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterBucle(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitBucle(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitBucle(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InicializacionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_inicializacion;
    }

	identificador() {
	    return this.getTypedRuleContext(IdentificadorContext,0);
	};

	IGUAL() {
	    return this.getToken(analizadorParser.IGUAL, 0);
	};

	DIGITO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(analizadorParser.DIGITO);
	    } else {
	        return this.getToken(analizadorParser.DIGITO, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterInicializacion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitInicializacion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitInicializacion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CondicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_condicion;
    }

	identificador() {
	    return this.getTypedRuleContext(IdentificadorContext,0);
	};

	operador_relacional() {
	    return this.getTypedRuleContext(Operador_relacionalContext,0);
	};

	DIGITO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(analizadorParser.DIGITO);
	    } else {
	        return this.getToken(analizadorParser.DIGITO, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterCondicion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitCondicion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitCondicion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ActualizacionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_actualizacion;
    }

	identificador() {
	    return this.getTypedRuleContext(IdentificadorContext,0);
	};

	operador_incremento() {
	    return this.getTypedRuleContext(Operador_incrementoContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterActualizacion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitActualizacion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitActualizacion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Operador_relacionalContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_operador_relacional;
    }

	PACMANI() {
	    return this.getToken(analizadorParser.PACMANI, 0);
	};

	PACMANIIGUAL() {
	    return this.getToken(analizadorParser.PACMANIIGUAL, 0);
	};

	PACMAND() {
	    return this.getToken(analizadorParser.PACMAND, 0);
	};

	PACMANDIGUAL() {
	    return this.getToken(analizadorParser.PACMANDIGUAL, 0);
	};

	IGUALIGUAL() {
	    return this.getToken(analizadorParser.IGUALIGUAL, 0);
	};

	TRES() {
	    return this.getToken(analizadorParser.TRES, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterOperador_relacional(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitOperador_relacional(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitOperador_relacional(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Operador_incrementoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_operador_incremento;
    }

	MASMAS() {
	    return this.getToken(analizadorParser.MASMAS, 0);
	};

	GUIONGUION() {
	    return this.getToken(analizadorParser.GUIONGUION, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterOperador_incremento(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitOperador_incremento(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitOperador_incremento(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SentenciaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_sentencia;
    }

	salida() {
	    return this.getTypedRuleContext(SalidaContext,0);
	};

	sentencia() {
	    return this.getTypedRuleContext(SentenciaContext,0);
	};

	terminar() {
	    return this.getTypedRuleContext(TerminarContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterSentencia(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitSentencia(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitSentencia(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SalidaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_salida;
    }

	IMPRIMIR() {
	    return this.getToken(analizadorParser.IMPRIMIR, 0);
	};

	PARENTESISI() {
	    return this.getToken(analizadorParser.PARENTESISI, 0);
	};

	cadena() {
	    return this.getTypedRuleContext(CadenaContext,0);
	};

	PARENTESISD() {
	    return this.getToken(analizadorParser.PARENTESISD, 0);
	};

	DOS() {
	    return this.getToken(analizadorParser.DOS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterSalida(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitSalida(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitSalida(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TerminarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_terminar;
    }

	BO() {
	    return this.getToken(analizadorParser.BO, 0);
	};

	DOS() {
	    return this.getToken(analizadorParser.DOS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterTerminar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitTerminar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitTerminar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class IdentificadorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_identificador;
    }

	LETRA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(analizadorParser.LETRA);
	    } else {
	        return this.getToken(analizadorParser.LETRA, i);
	    }
	};


	DIGITO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(analizadorParser.DIGITO);
	    } else {
	        return this.getToken(analizadorParser.DIGITO, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterIdentificador(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitIdentificador(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitIdentificador(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CadenaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_cadena;
    }

	BACK = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(analizadorParser.BACK);
	    } else {
	        return this.getToken(analizadorParser.BACK, i);
	    }
	};


	caracteres() {
	    return this.getTypedRuleContext(CaracteresContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterCadena(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitCadena(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitCadena(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CaracteresContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_caracteres;
    }

	caracter() {
	    return this.getTypedRuleContext(CaracterContext,0);
	};

	caracteres() {
	    return this.getTypedRuleContext(CaracteresContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterCaracteres(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitCaracteres(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitCaracteres(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CaracterContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorParser.RULE_caracter;
    }

	LETRA() {
	    return this.getToken(analizadorParser.LETRA, 0);
	};

	DIGITO() {
	    return this.getToken(analizadorParser.DIGITO, 0);
	};

	SIMBOLO() {
	    return this.getToken(analizadorParser.SIMBOLO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.enterCaracter(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorListener ) {
	        listener.exitCaracter(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorVisitor ) {
	        return visitor.visitCaracter(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




analizadorParser.InstruccionesContext = InstruccionesContext; 
analizadorParser.InstruccionContext = InstruccionContext; 
analizadorParser.BucleContext = BucleContext; 
analizadorParser.InicializacionContext = InicializacionContext; 
analizadorParser.CondicionContext = CondicionContext; 
analizadorParser.ActualizacionContext = ActualizacionContext; 
analizadorParser.Operador_relacionalContext = Operador_relacionalContext; 
analizadorParser.Operador_incrementoContext = Operador_incrementoContext; 
analizadorParser.SentenciaContext = SentenciaContext; 
analizadorParser.SalidaContext = SalidaContext; 
analizadorParser.TerminarContext = TerminarContext; 
analizadorParser.IdentificadorContext = IdentificadorContext; 
analizadorParser.CadenaContext = CadenaContext; 
analizadorParser.CaracteresContext = CaracteresContext; 
analizadorParser.CaracterContext = CaracterContext; 
