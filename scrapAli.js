const scrape = require('aliexpress-product-scraper');
const product = scrape('1005005152888024');

product.then(res => {
    console.log('The JSON: ', JSON.stringify(res));
});