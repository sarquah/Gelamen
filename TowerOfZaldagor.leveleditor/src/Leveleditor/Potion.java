/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.Potion#getSkill <em>Skill</em>}</li>
 *   <li>{@link Leveleditor.Potion#getAddSkill <em>Add Skill</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getPotion()
 * @model
 * @generated
 */
public interface Potion extends Item {
	/**
	 * Returns the value of the '<em><b>Skill</b></em>' attribute.
	 * The literals are from the enumeration {@link Leveleditor.ESkill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill</em>' attribute.
	 * @see Leveleditor.ESkill
	 * @see #setSkill(ESkill)
	 * @see Leveleditor.LeveleditorPackage#getPotion_Skill()
	 * @model
	 * @generated
	 */
	ESkill getSkill();

	/**
	 * Sets the value of the '{@link Leveleditor.Potion#getSkill <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' attribute.
	 * @see Leveleditor.ESkill
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(ESkill value);

	/**
	 * Returns the value of the '<em><b>Add Skill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Skill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Skill</em>' attribute.
	 * @see #setAddSkill(int)
	 * @see Leveleditor.LeveleditorPackage#getPotion_AddSkill()
	 * @model
	 * @generated
	 */
	int getAddSkill();

	/**
	 * Sets the value of the '{@link Leveleditor.Potion#getAddSkill <em>Add Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Skill</em>' attribute.
	 * @see #getAddSkill()
	 * @generated
	 */
	void setAddSkill(int value);

} // Potion
