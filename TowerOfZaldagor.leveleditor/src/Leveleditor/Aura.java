/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.Aura#getAuraType <em>Aura Type</em>}</li>
 *   <li>{@link Leveleditor.Aura#getAmmount <em>Ammount</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getAura()
 * @model
 * @generated
 */
public interface Aura extends EObject {
	/**
	 * Returns the value of the '<em><b>Aura Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Leveleditor.EAura}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aura Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aura Type</em>' attribute.
	 * @see Leveleditor.EAura
	 * @see #setAuraType(EAura)
	 * @see Leveleditor.LeveleditorPackage#getAura_AuraType()
	 * @model
	 * @generated
	 */
	EAura getAuraType();

	/**
	 * Sets the value of the '{@link Leveleditor.Aura#getAuraType <em>Aura Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aura Type</em>' attribute.
	 * @see Leveleditor.EAura
	 * @see #getAuraType()
	 * @generated
	 */
	void setAuraType(EAura value);

	/**
	 * Returns the value of the '<em><b>Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ammount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ammount</em>' attribute.
	 * @see #setAmmount(int)
	 * @see Leveleditor.LeveleditorPackage#getAura_Ammount()
	 * @model
	 * @generated
	 */
	int getAmmount();

	/**
	 * Sets the value of the '{@link Leveleditor.Aura#getAmmount <em>Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ammount</em>' attribute.
	 * @see #getAmmount()
	 * @generated
	 */
	void setAmmount(int value);

} // Aura
