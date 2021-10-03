
 describe('When Rocket Innovation Studio About Us page is loaded', () => {
    beforeEach(() => {
      cy.visit('/about');
    });
 

    it('Has a valid title, expected Navigation items/images and these links are not broken', () => {
    
      cy.title().should('eq','About Us | Rocket Innovation Studio')
     
      cy.get('[alt="About Us"]').click() 

      cy.contains('About Us').click()
      cy.visit('/about');
    
      cy.contains('Solutions').click()
      cy.visit('/about');
    
      cy.contains('Careers').click()
      cy.visit('/about');
     
    })
  })

