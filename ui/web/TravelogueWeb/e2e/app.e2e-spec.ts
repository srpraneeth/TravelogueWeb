import { TravelogueWebPage } from './app.po';

describe('travelogue-web App', function() {
  let page: TravelogueWebPage;

  beforeEach(() => {
    page = new TravelogueWebPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
