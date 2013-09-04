/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ECreature Race</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorPackage#getECreatureRace()
 * @model
 * @generated
 */
public enum ECreatureRace implements Enumerator {
	/**
	 * The '<em><b>Human</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN(0, "Human", "Human"),

	/**
	 * The '<em><b>Orc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORC_VALUE
	 * @generated
	 * @ordered
	 */
	ORC(1, "Orc", "Orc"),

	/**
	 * The '<em><b>Goblin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOBLIN_VALUE
	 * @generated
	 * @ordered
	 */
	GOBLIN(2, "Goblin", "Goblin"),

	/**
	 * The '<em><b>Elf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELF_VALUE
	 * @generated
	 * @ordered
	 */
	ELF(3, "Elf", "Elf"), /**
	 * The '<em><b>Rat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAT_VALUE
	 * @generated
	 * @ordered
	 */
	RAT(4, "Rat", "Rat"), /**
	 * The '<em><b>Dark Orc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARK_ORC_VALUE
	 * @generated
	 * @ordered
	 */
	DARK_ORC(7, "DarkOrc", "DarkOrc"), /**
	 * The '<em><b>Wererat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WERERAT_VALUE
	 * @generated
	 * @ordered
	 */
	WERERAT(6, "Wererat", "Wererat"), /**
	 * The '<em><b>Hellhound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELLHOUND_VALUE
	 * @generated
	 * @ordered
	 */
	HELLHOUND(5, "Hellhound", "Hellhound"), /**
	 * The '<em><b>Troll</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TROLL_VALUE
	 * @generated
	 * @ordered
	 */
	TROLL(8, "Troll", "Troll"), /**
	 * The '<em><b>Undead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEAD_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEAD(9, "Undead", "Undead"), /**
	 * The '<em><b>Reptile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPTILE_VALUE
	 * @generated
	 * @ordered
	 */
	REPTILE(10, "Reptile", "Reptile");

	/**
	 * The '<em><b>Human</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Human</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HUMAN
	 * @model name="Human"
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_VALUE = 0;

	/**
	 * The '<em><b>Orc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Orc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORC
	 * @model name="Orc"
	 * @generated
	 * @ordered
	 */
	public static final int ORC_VALUE = 1;

	/**
	 * The '<em><b>Goblin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Goblin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOBLIN
	 * @model name="Goblin"
	 * @generated
	 * @ordered
	 */
	public static final int GOBLIN_VALUE = 2;

	/**
	 * The '<em><b>Elf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Elf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELF
	 * @model name="Elf"
	 * @generated
	 * @ordered
	 */
	public static final int ELF_VALUE = 3;

	/**
	 * The '<em><b>Rat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAT
	 * @model name="Rat"
	 * @generated
	 * @ordered
	 */
	public static final int RAT_VALUE = 4;

	/**
	 * The '<em><b>Dark Orc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dark Orc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARK_ORC
	 * @model name="DarkOrc"
	 * @generated
	 * @ordered
	 */
	public static final int DARK_ORC_VALUE = 7;

	/**
	 * The '<em><b>Wererat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wererat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WERERAT
	 * @model name="Wererat"
	 * @generated
	 * @ordered
	 */
	public static final int WERERAT_VALUE = 6;

	/**
	 * The '<em><b>Hellhound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hellhound</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HELLHOUND
	 * @model name="Hellhound"
	 * @generated
	 * @ordered
	 */
	public static final int HELLHOUND_VALUE = 5;

	/**
	 * The '<em><b>Troll</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Troll</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TROLL
	 * @model name="Troll"
	 * @generated
	 * @ordered
	 */
	public static final int TROLL_VALUE = 8;

	/**
	 * The '<em><b>Undead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEAD
	 * @model name="Undead"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEAD_VALUE = 9;

	/**
	 * The '<em><b>Reptile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reptile</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPTILE
	 * @model name="Reptile"
	 * @generated
	 * @ordered
	 */
	public static final int REPTILE_VALUE = 10;

	/**
	 * An array of all the '<em><b>ECreature Race</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ECreatureRace[] VALUES_ARRAY =
		new ECreatureRace[] {
			HUMAN,
			ORC,
			GOBLIN,
			ELF,
			RAT,
			DARK_ORC,
			WERERAT,
			HELLHOUND,
			TROLL,
			UNDEAD,
			REPTILE,
		};

	/**
	 * A public read-only list of all the '<em><b>ECreature Race</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ECreatureRace> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ECreature Race</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ECreatureRace get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ECreatureRace result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ECreature Race</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ECreatureRace getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ECreatureRace result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ECreature Race</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ECreatureRace get(int value) {
		switch (value) {
			case HUMAN_VALUE: return HUMAN;
			case ORC_VALUE: return ORC;
			case GOBLIN_VALUE: return GOBLIN;
			case ELF_VALUE: return ELF;
			case RAT_VALUE: return RAT;
			case DARK_ORC_VALUE: return DARK_ORC;
			case WERERAT_VALUE: return WERERAT;
			case HELLHOUND_VALUE: return HELLHOUND;
			case TROLL_VALUE: return TROLL;
			case UNDEAD_VALUE: return UNDEAD;
			case REPTILE_VALUE: return REPTILE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ECreatureRace(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ECreatureRace
