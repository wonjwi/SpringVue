module.exports = {
    "env": {
        "browser": true,
        "commonjs": true,
        "es2021": true
    },
    "extends": [
        "eslint:recommended",
        "plugin:vue/essential"
    ],
    "parserOptions": {
        "ecmaVersion": 12
    },
    "plugins": [
        "vue"
    ],
    "rules": {
        "vue/multi-word-component-names": ["error", {
            "ignores": ["Home", "Header", "Content"]
        }]
    }
};
