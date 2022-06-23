const vscode_lc = require('vscode-languageclient/node')

const path = require('path');
const spawn = require('child_process').spawn

function activate(context) {

  const clientOptions = {
    documentSelector: ['sm', 'statemachine']
  }

  const serverOptions = function () {
    const jar = context.asAbsolutePath(path.join('bin', 'statemachine.ide-1.0.0-SNAPSHOT-ls.jar'));

    const child = spawn('java', ['-jar', jar]);

    child.stdout.on('data', function (chunk) {
      console.log(chunk.toString());
    });

    child.stderr.on('data', function (chunk) {
      console.error(chunk.toString());
    });

    return Promise.resolve(child);
  };

  // Create the language server
  const disposable = new vscode_lc.LanguageClient('Statemachine', serverOptions, clientOptions).start();
  context.subscriptions.push(disposable);
}

module.exports = {
  activate
}
