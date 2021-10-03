
 describe('When Rocket Innovation Studio Solutions page is loaded', () => {
    beforeEach(() => {
      cy.visit('/');
    });
 

    it('Has a title and Navigation items', () => {
      cy.contains('Solutions').click()
      cy.title().should('eq','Solutions | Rocket Innovation Studio')
      cy.contains('About Us')
      cy.contains('Solutions')
      cy.contains('Careers')
      cy.get('img[alt="Solutions"]').click()
     

      cy.contains('About Us').click()
      cy.visit('/solutions');
      cy.contains('Solutions').click()
      cy.visit('/solutions');
      cy.contains('Careers').click()
      cy.visit('/solutions');


      
    })
  })

