package rich.yang.com.xrichtext;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import rich.yang.com.xrichtext.bean.Article;
import rich.yang.com.xrichtext.view.RichTextEditor;

/**
 * 新建/编辑(动态/文章)
 */
public class ArticleActivity extends Activity {

    public static void actionLaunch(Context context) {
        Intent intent = new Intent(context, ArticleActivity.class);
        context.startActivity(intent);
    }

    public static void actionLaunch(Context context, Article article) {
        Intent intent = new Intent(context, ArticleActivity.class);
        intent.putExtra("Article", article);
        context.startActivity(intent);
    }

    private Article mArticle;
    private EditText new_title;
    private RichTextEditor new_rich_edit;
    private Button new_add_photo;
    private Button new_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        initView();
        initData();
    }

    private void initView() {
        new_title = (EditText) findViewById(R.id.new_title);
        new_rich_edit = (RichTextEditor) findViewById(R.id.new_rich_edit);
        new_add_photo = (Button) findViewById(R.id.new_add_photo);
        new_save = (Button) findViewById(R.id.new_save);
    }

    private void initData() {
        mArticle = (Article) getIntent().getSerializableExtra("Article");
    }
}
