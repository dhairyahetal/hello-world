
 describe('When Rocket Innovation Studio Home page is loaded', () => {
    beforeEach(() => {
      cy.visit('/');
    });
 

    it('Has a title and Navigation items', () => {
     
      cy.contains('About Us')
      cy.contains('Solutions')
      cy.contains('Careers')
     
      cy.get('img[alt="Home Banner"]').click({force: true})
      cy.contains('About Us').click()
      cy.visit('/')
      cy.contains('Solutions').click()
      cy.visit('/')
      cy.contains('Careers').click()
      cy.visit('https://rocketinnovationstudio.ca/')
      
    })
  })