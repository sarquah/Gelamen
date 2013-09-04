/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import Leveleditor.EElement;
import Leveleditor.LeveleditorPackage;
import Leveleditor.Trap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.TrapImpl#getPoison <em>Poison</em>}</li>
 *   <li>{@link Leveleditor.impl.TrapImpl#getFire <em>Fire</em>}</li>
 *   <li>{@link Leveleditor.impl.TrapImpl#getIce <em>Ice</em>}</li>
 *   <li>{@link Leveleditor.impl.TrapImpl#getLightning <em>Lightning</em>}</li>
 *   <li>{@link Leveleditor.impl.TrapImpl#getNormal <em>Normal</em>}</li>
 *   <li>{@link Leveleditor.impl.TrapImpl#getTrapagility <em>Trapagility</em>}</li>
 *   <li>{@link Leveleditor.impl.TrapImpl#getTrapdescription <em>Trapdescription</em>}</li>
 *   <li>{@link Leveleditor.impl.TrapImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrapImpl extends EObjectImpl implements Trap {
	/**
	 * The default value of the '{@link #getPoison() <em>Poison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoison()
	 * @generated
	 * @ordered
	 */
	protected static final int POISON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoison() <em>Poison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoison()
	 * @generated
	 * @ordered
	 */
	protected int poison = POISON_EDEFAULT;

	/**
	 * The default value of the '{@link #getFire() <em>Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFire()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFire() <em>Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFire()
	 * @generated
	 * @ordered
	 */
	protected int fire = FIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIce() <em>Ice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIce()
	 * @generated
	 * @ordered
	 */
	protected static final int ICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIce() <em>Ice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIce()
	 * @generated
	 * @ordered
	 */
	protected int ice = ICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLightning() <em>Lightning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightning()
	 * @generated
	 * @ordered
	 */
	protected static final int LIGHTNING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLightning() <em>Lightning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightning()
	 * @generated
	 * @ordered
	 */
	protected int lightning = LIGHTNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormal() <em>Normal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal()
	 * @generated
	 * @ordered
	 */
	protected static final int NORMAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNormal() <em>Normal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal()
	 * @generated
	 * @ordered
	 */
	protected int normal = NORMAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrapagility() <em>Trapagility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrapagility()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAPAGILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTrapagility() <em>Trapagility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrapagility()
	 * @generated
	 * @ordered
	 */
	protected int trapagility = TRAPAGILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrapdescription() <em>Trapdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrapdescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAPDESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrapdescription() <em>Trapdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrapdescription()
	 * @generated
	 * @ordered
	 */
	protected String trapdescription = TRAPDESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EElement TYPE_EDEFAULT = EElement.LIGHTNING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EElement type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.TRAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoison() {
		return poison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoison(int newPoison) {
		int oldPoison = poison;
		poison = newPoison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.TRAP__POISON, oldPoison, poison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFire() {
		return fire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFire(int newFire) {
		int oldFire = fire;
		fire = newFire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.TRAP__FIRE, oldFire, fire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIce() {
		return ice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIce(int newIce) {
		int oldIce = ice;
		ice = newIce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.TRAP__ICE, oldIce, ice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLightning() {
		return lightning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightning(int newLightning) {
		int oldLightning = lightning;
		lightning = newLightning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.TRAP__LIGHTNING, oldLightning, lightning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNormal() {
		return normal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormal(int newNormal) {
		int oldNormal = normal;
		normal = newNormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.TRAP__NORMAL, oldNormal, normal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrapagility() {
		return trapagility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrapagility(int newTrapagility) {
		int oldTrapagility = trapagility;
		trapagility = newTrapagility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.TRAP__TRAPAGILITY, oldTrapagility, trapagility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrapdescription() {
		return trapdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrapdescription(String newTrapdescription) {
		String oldTrapdescription = trapdescription;
		trapdescription = newTrapdescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.TRAP__TRAPDESCRIPTION, oldTrapdescription, trapdescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EElement getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EElement newType) {
		EElement oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.TRAP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeveleditorPackage.TRAP__POISON:
				return getPoison();
			case LeveleditorPackage.TRAP__FIRE:
				return getFire();
			case LeveleditorPackage.TRAP__ICE:
				return getIce();
			case LeveleditorPackage.TRAP__LIGHTNING:
				return getLightning();
			case LeveleditorPackage.TRAP__NORMAL:
				return getNormal();
			case LeveleditorPackage.TRAP__TRAPAGILITY:
				return getTrapagility();
			case LeveleditorPackage.TRAP__TRAPDESCRIPTION:
				return getTrapdescription();
			case LeveleditorPackage.TRAP__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LeveleditorPackage.TRAP__POISON:
				setPoison((Integer)newValue);
				return;
			case LeveleditorPackage.TRAP__FIRE:
				setFire((Integer)newValue);
				return;
			case LeveleditorPackage.TRAP__ICE:
				setIce((Integer)newValue);
				return;
			case LeveleditorPackage.TRAP__LIGHTNING:
				setLightning((Integer)newValue);
				return;
			case LeveleditorPackage.TRAP__NORMAL:
				setNormal((Integer)newValue);
				return;
			case LeveleditorPackage.TRAP__TRAPAGILITY:
				setTrapagility((Integer)newValue);
				return;
			case LeveleditorPackage.TRAP__TRAPDESCRIPTION:
				setTrapdescription((String)newValue);
				return;
			case LeveleditorPackage.TRAP__TYPE:
				setType((EElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LeveleditorPackage.TRAP__POISON:
				setPoison(POISON_EDEFAULT);
				return;
			case LeveleditorPackage.TRAP__FIRE:
				setFire(FIRE_EDEFAULT);
				return;
			case LeveleditorPackage.TRAP__ICE:
				setIce(ICE_EDEFAULT);
				return;
			case LeveleditorPackage.TRAP__LIGHTNING:
				setLightning(LIGHTNING_EDEFAULT);
				return;
			case LeveleditorPackage.TRAP__NORMAL:
				setNormal(NORMAL_EDEFAULT);
				return;
			case LeveleditorPackage.TRAP__TRAPAGILITY:
				setTrapagility(TRAPAGILITY_EDEFAULT);
				return;
			case LeveleditorPackage.TRAP__TRAPDESCRIPTION:
				setTrapdescription(TRAPDESCRIPTION_EDEFAULT);
				return;
			case LeveleditorPackage.TRAP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LeveleditorPackage.TRAP__POISON:
				return poison != POISON_EDEFAULT;
			case LeveleditorPackage.TRAP__FIRE:
				return fire != FIRE_EDEFAULT;
			case LeveleditorPackage.TRAP__ICE:
				return ice != ICE_EDEFAULT;
			case LeveleditorPackage.TRAP__LIGHTNING:
				return lightning != LIGHTNING_EDEFAULT;
			case LeveleditorPackage.TRAP__NORMAL:
				return normal != NORMAL_EDEFAULT;
			case LeveleditorPackage.TRAP__TRAPAGILITY:
				return trapagility != TRAPAGILITY_EDEFAULT;
			case LeveleditorPackage.TRAP__TRAPDESCRIPTION:
				return TRAPDESCRIPTION_EDEFAULT == null ? trapdescription != null : !TRAPDESCRIPTION_EDEFAULT.equals(trapdescription);
			case LeveleditorPackage.TRAP__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (poison: ");
		result.append(poison);
		result.append(", fire: ");
		result.append(fire);
		result.append(", ice: ");
		result.append(ice);
		result.append(", lightning: ");
		result.append(lightning);
		result.append(", normal: ");
		result.append(normal);
		result.append(", trapagility: ");
		result.append(trapagility);
		result.append(", trapdescription: ");
		result.append(trapdescription);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TrapImpl
